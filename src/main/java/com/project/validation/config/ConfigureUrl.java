package com.project.validation.config;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "url")
@Data
public class ConfigureUrl {
    private String feedGMA;
    private String feedGMA_global;
}
