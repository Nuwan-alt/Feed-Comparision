package com.project.validation.model;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Getter
public class DataSource {
    Map<String,String> TD = new HashMap<>();
    Map<String,String> TD_global = new HashMap<>();
    Map<String,String> missMatchData = new HashMap<>();
    Map<String,String> notFoundData = new HashMap<>();

    List<String> TD_test = new ArrayList<>();
    List<String> TD_global_test = new ArrayList<>();

}
