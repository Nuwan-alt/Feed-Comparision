package com.project.validation.model;

import com.project.validation.config.ConfigureUrl;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class URLSource {
    @Autowired
    ConfigureUrl configureUrl;

    @Getter
    private Map<String,String> urlMap = new HashMap<>();

    @Bean
    private void mapUrl(){
        urlMap.put("feedGMA",configureUrl.getFeedGMA());
        urlMap.put("feedGMA_global",configureUrl.getFeedGMA_global());
    }

}
