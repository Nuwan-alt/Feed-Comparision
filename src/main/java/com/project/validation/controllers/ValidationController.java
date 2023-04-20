package com.project.validation.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.project.validation.service.DataFetchClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationController {

    @Autowired
    DataFetchClientService dataFetchClientService;

    @GetMapping("/get")
    public String getValidationDAta() throws JsonProcessingException {
        dataFetchClientService.getData();
        return "Done!";

    }




}
