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
    public void comparison(Map<String,String> map1, Map<String,String> map2 ){
        int co = 0;
        for (String key:map1.keySet()) {
            ++co;
            String valueInMap1 = map1.get(key);
            if(map2.containsKey(key)){
                String valueInMap2 = map2.get(key);
                if(valueInMap1.equals(valueInMap2)){
//                    System.out.println("sucess " + co);
                }else {
//                    System.out.println(feedGMAData +"========" + feedGMA_globalData);
                }
            }else {
//                System.out.println("not match "  + co);
//                dataSource.getNotFoundData().put(key,feedGMA.get(key));
            }
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
