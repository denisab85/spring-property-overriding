package com.example.springpropertyoverriding;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropertiesConfigTest {

    @Autowired
    ApplicationPropertiesHolder applicationPropertiesHolder;

    @Test
    void definedInAppProperties() {
        Assertions.assertEquals("overridden", applicationPropertiesHolder.getApp(), "test.app");
    }

    @Test
    void definedInApplicationProperties() {
        Assertions.assertEquals("overridden", applicationPropertiesHolder.getApplication(), "test.application");
    }

}
