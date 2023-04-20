package com.project.validation.service;

import com.project.validation.model.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DataComparisonService {
    @Autowired
    DataSource dataSource;

    public void comparisonTask(Map<String,String> map1, Map<String,String> map2){
        compareMap(map1,map2);
        compareMap(map2,map1);
    }
    private void compareMap(Map<String,String> map1, Map<String,String> map2){
        int co = 0;
        for (String key:map1.keySet()) {

            ++co;
            String valueInMap1 = map1.get(key);

            if(map2.containsKey(key)){

                String valueInMap2 = map2.get(key);

                if(valueInMap1.equals(valueInMap2)){
                    addItemToMap(dataSource.getSuccessData(),key,valueInMap1);
                    System.out.println("success " + co);
                }else {
                    System.out.println("failed " + co);
                    addItemToMap(dataSource.getMissMatchData(),key,valueInMap1);
                }
            }else {
                System.out.println("not match "  + co);
                addItemToMap(dataSource.getNotFoundData(),key,valueInMap1 );

            }
        }
    }

    private void addItemToMap(Map<String,String> stringStringMap,  String key, String value){
        if(!stringStringMap.containsKey(key)){
            stringStringMap.put(key,value);
        }
    }


    public void testComparison(List<String> td_test, List<String> td_global_test){
        for (String key: td_test) {
            if(td_global_test.contains(key)){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
