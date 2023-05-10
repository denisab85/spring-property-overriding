package com.example.springpropertyoverriding;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource(value = {
        "classpath:application.properties",
        "classpath:app.properties",
        "classpath:override.properties"
})
@ConfigurationProperties(prefix = "test")
public class ApplicationPropertiesConfig {

    private String application;

    private String app;

}