package com.project.validation.service;

import com.project.validation.model.DataSource;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataProcessService {

    private List<String> types = new ArrayList<>();
    @Autowired
    AddDataToSourceService addDataToSourceService;
    @Autowired
    DataComparisonService dataComparisonService;
    @Autowired
    DataSource dataSource;


    public void processResponse(JSONObject responseBodyJSONObject, String type) {

        JSONArray jsonArray = (JSONArray) responseBodyJSONObject.get("TD");
        for (int i = 0; i < jsonArray.length(); i++) {
            String value = jsonArray.get(i).toString();
//            String value = jsonArray.get(i).toString().replace("|",",");

//            JSONObject jsonObject = new JSONObject(jsonString);

            String[] singleData = value.split("\\|");

            String key = singleData[0] + "@" + singleData[1];

            System.out.println(key +"<-" +type);

            addDataToSourceService.addData(type,key,value);

        }
        System.out.println("======================================================================================");
        dataComparisonService.comparisonTask(dataSource.getTD(),dataSource.getTD_global());
        System.out.println(dataSource.getSuccessData().size() + "<- success");
        System.out.println(dataSource.getMissMatchData().size() + "<- miss");
        System.out.println(dataSource.getNotFoundData().size() + "<- not found");

    }

    private void getDataTypes() {
        types.add("VRS");
        types.add("TD");
        types.add("WLD");
        types.add("WLTD");
        types.add("ID");
    }


}
