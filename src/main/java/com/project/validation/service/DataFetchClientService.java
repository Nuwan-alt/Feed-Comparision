package com.project.validation.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.validation.model.URLSource;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class DataFetchClientService {
//    ConfigureUrl configureUrl = new ConfigureUrl();

    @Autowired
    DataProcessService dataProcessService;
    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    URLSource dataSource;
    RestTemplate restTemplate = new RestTemplate();

    public void getData(){

        Map<String,String> urlMap = dataSource.getUrlMap();

        for (String key:urlMap.keySet()) {
            String resourceUrl = urlMap.get(key);

            ResponseEntity<String> response
                    = restTemplate.getForEntity(resourceUrl, String.class);

            JSONObject responseBodyJSONObject =(new JSONObject(response.getBody())).getJSONObject("DAT");

            dataProcessService.processResponse(responseBodyJSONObject,key);

        }

    }

}
