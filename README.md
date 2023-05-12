# Spring Property Overriding with @PropertySource (demo)

This Spring Boot application is a sample project specifically designed to demonstrate 
property overriding behavior in a Spring Boot configuration.

## Purpose

The purpose of this application is to show the specifics of the properties overriding
mechanism in a Spring Boot project.

## Structure
* `ApplicationPropertiesHolder` class maps its fields to corresponding properties 
to be loaded from different property sources. The expectation is, while each property/field is 
defined in either `application.properties` or `app.properties`, both should be overridden by
same-name values in `override.properties`.
* `AdditionalConfigurationFilesAdder` class adds additional property sources to the application's 
environment. The added sources will override values defined in `application.properties`
including profile-specific `application-*.properties`.
* `Application` class serves as the entry point of the application.

## Usage

To run the project, follow these steps:

1. Ensure that you have Java and Maven installed on your system.
2. Clone the repository and navigate to the project directory.
3. Build the project using the command: `mvn clean install`
4. Run the application using the command: `mvn test`

## Properties Files Used

* `application.properties`: defines the `application` field in the `ApplicationPropertiesHolder` class.
* `app.properties`: defines the `app` field in the `ApplicationPropertiesHolder` class.
* `override.properties`: overrides both `app` and `application` properties.

## Tests

The `PropertiesConfigTest` class includes two test methods:

* `definedInAppProperties()`: verifies that the value of the `app`
* property is overridden as expected according to `override.properties`.
* `definedInApplicationProperties()`: asserts that the value of the 
* `application` property is overridden according to `override.properties`. 

## Links

The specifics of Spring Boot property overriding behavior discussed on GitHub and on StackOverflow:
* [@PropertySource not overriding in order [SPR-13500]](https://github.com/spring-projects/spring-framework/issues/18078#issuecomment-711850211) - in a comment by Maksim Muruev (mmuruev).
* [How to override application.properties during production in Spring-Boot?](https://stackoverflow.com/questions/23563363/how-to-override-application-properties-during-production-in-spring-boot#comment111803095_28488602) - in a comment by Alexander Vasiljev.
* [@PropertySource doesn't override properties defined in application.properties](https://stackoverflow.com/questions/76223453/propertysource-doesnt-override-properties-defined-in-application-properties) - My question and an answer to it that helped to build this solution. Thanks to [M. Deinum from Netherlands](https://stackoverflow.com/users/2696260/m-deinum) 