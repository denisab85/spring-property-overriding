package com.example.springpropertyoverriding;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource(value = {
        "classpath:application.properties",
        "classpath:app.properties",
        "classpath:override.properties"
})
public class ApplicationPropertiesConfig {

    @Value("${test.application}")
    protected String application;  // == "original"

    @Value("${test.app}")
    protected String app;          // == "overridden"

}