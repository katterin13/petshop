# PetShop

- H2 ui: http://localhost:8080/h2-console/login.do

- Swagger ui: http://localhost:8080/swagger-ui/index.html


### Run proyect

Libraries
- JUnit 5
- Spring Boot
- Maven
- DB H2
- Java version 11
- Sawgger


Run Project

```
mvn spring-boot:run
```

## Unit Test
Example Unit test

```
@Test
void should_ReturnTrue_When_equalsLenght() {
// given
String textA = "library";
String textB = "numeric";
// when
boolean result =
validateService.equalsLenght(textA, textB);
// then
assertTrue(result);
}
```

## Test-lifecycle

![test-lifecycle](/src/main/resources/img/test-lifecycle.drawio.png)
