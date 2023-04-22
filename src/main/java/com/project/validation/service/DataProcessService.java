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
    @Autowired
    AddDataToSourceService addDataToSourceService;

    public void processResponse(JSONObject responseBodyJSONObject, String type) {

        JSONArray jsonArray = (JSONArray) responseBodyJSONObject.get("TD");
        for (int i = 0; i < jsonArray.length(); i++) {
//            System.out.println(i + " < " + type);
            String value = jsonArray.get(i).toString();

            String[] singleData = value.split("\\|");

            String key = singleData[0] + "@" + singleData[1];

//            System.out.println(key +"<-" +type);

            addDataToSourceService.addData(type,key,value);

        }

    }

}
