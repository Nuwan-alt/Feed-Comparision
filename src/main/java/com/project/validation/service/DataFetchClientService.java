package com.project.validation.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.validation.model.DataSource;
import com.project.validation.model.URLSource;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class DataFetchClientService {

    @Autowired
    DataProcessService dataProcessService;
    @Autowired
    URLSource urlSource;
    @Autowired
    DataSource dataSource;

    @Autowired
    FileWriteService fileWriteService;

    @Autowired
            DataComparisonService dataComparisonService;
    RestTemplate restTemplate = new RestTemplate();

    public void getData() {

        Map<String, String> urlMap = urlSource.getUrlMap();

        for (String key : urlMap.keySet()) {
            String resourceUrl = urlMap.get(key);

            ResponseEntity<String> response
                    = restTemplate.getForEntity(resourceUrl, String.class);

            JSONObject responseBodyJSONObject = (new JSONObject(response.getBody())).getJSONObject("DAT");

            dataProcessService.processResponse(responseBodyJSONObject, key);

        }

        System.out.println("======================================================================================");
        dataComparisonService.comparisonTask(dataSource.getTD(),dataSource.getTD_global());
        System.out.println(dataSource.getSuccessData().size() + "<- success");
        System.out.println(dataSource.getMissMatchData().size() + "<- miss");
        System.out.println(dataSource.getNotFoundData().size() + "<- not found");
        System.out.println(dataSource.getTD().size()   + "<- TD size");
        System.out.println(dataSource.getTD_global().size() + "<- TD_global size");
//        System.out.println(dataSource.getTD_global());
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        System.out.println(dataSource.getTD());

        fileWriteService.writeFile(dataSource.getTD(),
                dataSource.getTD_global(),
                dataSource.getSuccessData(),
                dataSource.getMissMatchData(),
                dataSource.getNotFoundData());
    }



}
