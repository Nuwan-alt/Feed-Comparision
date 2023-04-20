package com.project.validation;


import com.project.validation.model.VRS;
import com.project.validation.service.DataFetchClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValidationApplication {

	public static void main(String[] args) {
//		DataFetchClientService dataFetchClient = new DataFetchClientService();
		SpringApplication.run(ValidationApplication.class, args);
//		dataFetchClient.getData();

	}

}
