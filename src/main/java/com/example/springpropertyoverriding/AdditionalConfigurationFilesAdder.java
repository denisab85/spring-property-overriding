package com.example.springpropertyoverriding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.support.ResourcePropertySource;

import java.io.IOException;

/**
 * A class that adds additional property sources to the application's environment.
 * The added sources will override values defined in <code>application.properties</code>
 * including profile-specific <code>application-*.properties</code>.
 */
public class AdditionalConfigurationFilesAdder implements EnvironmentPostProcessor {

    /**
     * The locations of additional property sources. The order in which files are listed is important.
     * Later property sources will override the values defined in earlier ones. All of them will override
     * <code>application.properties</code> and profile-specific <code>application-*.properties</code>.
     */
    private static final String[] PROPERTY_SOURCES = {"classpath:app.properties", "classpath:override.properties"};

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        for (String location : PROPERTY_SOURCES) {
            try {
                ResourcePropertySource source = new ResourcePropertySource(location);
                environment.getPropertySources().addAfter("random", source);
            } catch (IOException ex) {
                throw new IllegalStateException(ex);
            }
        }
    }

}