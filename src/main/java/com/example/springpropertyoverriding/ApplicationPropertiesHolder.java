package com.example.springpropertyoverriding;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "test")
public class ApplicationPropertiesHolder {

    protected String application;

    protected String app;

}