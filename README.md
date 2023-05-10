# Spring Property Overriding with @PropertySource (bug demo)

This Spring Boot application is a sample project specifically designed to demonstrate a bug related to property overriding in a Spring Boot configuration.

## Purpose

The purpose of this application is to showcase a bug that occurs when attempting to override properties in a Spring Boot project. It includes a configuration class, ApplicationPropertiesConfig, that is responsible for loading properties from different property sources and mapping them to corresponding fields. The Application class serves as the entry point of the application.

## Usage

To observe the bug and understand the issue, follow these steps:

1. Ensure that you have Java and Maven installed on your system.
2. Clone the repository and navigate to the project directory.
3. Build the project using the command: mvn clean install
4. Run the application using the command: mvn test

## Properties Files Used

* application.properties: overriding properties from this file does not work.
* app.properties: overriding properties from this file works well.
* override.properties: contains overridden properties.

The class includes the following properties:

## Tests

The PropertiesConfigTest class includes two test methods:

* definedInAppProperties(): This test method verifies that the value of the app property is "overridden", as expected from app.properties. This test successfully passes.
* definedInApplicationProperties(): This test method is specifically designed to expose the bug related to property overriding. It asserts that the value of the application property should be "overridden" according to override.properties. However, this test fails, indicating that the property is not correctly overridden. 

## Bug

Please note that the failure of definedInApplicationProperties() clearly demonstrates the bug in overriding properties due to which values defined in `application.properties` don't get overridden even though re-defined in other .properties files referenced with `@PropertySource`. This requires further investigation and resolution to fix the bug.
Feel free to explore and modify the application to understand the issue better and experiment with potential fixes for the property overriding bug.

## Links

This bug was mentioned in GitHub and on StackOverflow:
* [@PropertySource not overriding in order [SPR-13500]](https://github.com/spring-projects/spring-framework/issues/18078#issuecomment-711850211) - in a comment by Maksim Muruev (mmuruev).
* [How to override application.properties during production in Spring-Boot?](https://stackoverflow.com/questions/23563363/how-to-override-application-properties-during-production-in-spring-boot#comment111803095_28488602) - in a comment by Alexander Vasiljev.
* 