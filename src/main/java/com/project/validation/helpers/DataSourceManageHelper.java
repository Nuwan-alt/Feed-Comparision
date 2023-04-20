package com.project.validation.helpers;

import com.project.validation.exceptions.KeyNotFoundException;
import com.project.validation.model.DataSource;
import com.project.validation.model.TD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataSourceManageHelper {
//    Map<String,String> ID = null;
//    Map<String,String> ID_global = null;
//    Map<String,String> VRS = null;
//    Map<String,String> VRS_global = null;
//    Map<String,String> WLD = null;
//    Map<String,String> WLD_global = null;
//    Map<String,String> WLTD = null;
//    Map<String,String> WLTD_global = null;

    @Autowired
    DataSource dataSource;


    public  void  addData(String type,String key, TD valueObject){
        if(type.equals("feedGMA")){
            dataSource.getTD().put(key,valueObject);
        }else {
            dataSource.getTD_global().put(key,valueObject);
        }
    }

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
