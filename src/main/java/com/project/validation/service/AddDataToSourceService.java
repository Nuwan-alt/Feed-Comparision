package com.project.validation.service;

import com.project.validation.model.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddDataToSourceService {
    @Autowired
    DataSource dataSource;
    public  void  addData(String type,String key, String value){
        if(type.equals("feedGMA")){
            dataSource.getTD().put(key,value);
        }else {
            dataSource.getTD_global().put(key,value);
        }
    }
}
