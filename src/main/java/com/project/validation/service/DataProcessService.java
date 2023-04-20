package com.project.validation.service;

import com.project.validation.helpers.DataSourceManageHelper;
import com.project.validation.model.DataSource;
import com.project.validation.model.TD;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class DataProcessService {

    private List<String> types = new ArrayList<>();

    @Autowired
    DataSourceManageHelper dataSourceManageHelper;
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
            System.out.println(singleData.length);
//            System.out.println(Arrays.toString(singleData));


//            dataSourceManageHelper.addData(type,key,valueObject);
            dataSourceManageHelper.testAdd(type,key);
        }

//        dataComparisonService.comparison(dataSource.getTD(), dataSource.getTD_global());
        System.out.println("======================================================================================");
        dataComparisonService.testComparison(dataSource.getTD_test(),dataSource.getTD_global_test());
//        dataSourceManageHelper.size();

//        dataSourceManageHelper.size();
    }

    private void getDataTypes() {
        types.add("VRS");
        types.add("TD");
        types.add("WLD");
        types.add("WLTD");
        types.add("ID");
    }


}
