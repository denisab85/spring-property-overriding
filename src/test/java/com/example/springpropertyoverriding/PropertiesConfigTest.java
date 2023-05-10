package com.example.springpropertyoverriding;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropertiesConfigTest {

    @Autowired
    ApplicationPropertiesConfig applicationPropertiesConfig;

    @Test
    void definedInAppProperties() {
        Assertions.assertEquals("overridden", applicationPropertiesConfig.getApp(), "test.app");
    }

    @Test
    void definedInApplicationProperties() {
        Assertions.assertEquals("overridden", applicationPropertiesConfig.getApplication(), "test.application");
    }

}
