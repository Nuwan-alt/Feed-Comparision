package com.project.validation.helpers;

import com.project.validation.exceptions.KeyNotFoundException;
import com.project.validation.model.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataSourceManageHelper {
    @Autowired
    DataSource dataSource;



    public void fetchData(String type,String key) throws KeyNotFoundException {

        if(type.equals("feedGMA")){
            if(dataSource.getTD().containsKey(key)){
//                return dataSource.getTD_global().get(key);
            }
           throw  new KeyNotFoundException(key);
        }else {
            if(dataSource.getTD().containsKey(key)){
//                return dataSource.getTD_global().get(key);
            }
            throw  new KeyNotFoundException(key);
        }
    }

    public void testAdd(String type,String key){
        if(type.equals("feedGMA")){
            dataSource.getTD_test().add(key);
        }else {
            dataSource.getTD_global_test().add(key);
        }

    }

    public void size(){
        System.out.println("============================================================================================================");
        System.out.println(dataSource.getTD().size());
    }
}
