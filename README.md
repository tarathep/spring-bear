# Spring Bear

This Example Spring Boot Framework for deploy to Azure Spring Cloud + Unitest with Mockito

## Why Spring?

Spring makes programming Java quicker, easier, and safer for everybody. Spring’s focus on speed, simplicity, and productivity has made it the world's most popular Java framework.

<img src="https://spring.io/images/spring-logo-9146a4d3298760c2e7e49595184e1975.svg" alt="Spring" width="200px">

Use Spring Boot framework ``Version 7.2.3 Snapshot`` on ``Java version 8`` and ``dependencies`` following

- spring-boot-starter-actuator
- spring-boot-starter-web
- spring-cloud-starter-config
- spring-cloud-starter-netflix-eureka-client
- spring-boot-starter-test
- jacoco-maven-plugin v 0.8.5

    ```xml
    <plugin>
        <groupId>org.jacoco</groupId>
        <artifactId>jacoco-maven-plugin</artifactId>
        <version>0.8.5</version>
        <executions>
            <execution>
            <goals>
                <goal>prepare-agent</goal>
            </goals>
            </execution>
            <execution>
            <id>report</id>
            <phase>test</phase>
            <goals>
                <goal>report</goal>
            </goals>
            </execution>
        </executions>
    </plugin>
    ```

## Run

for run on developing and debuging

```bash
mvn spring-boot:run
```

Example application

http://localhost:8080/bear/says?type=A

http://localhost:8080/bear/says?type=B

![](./media/example-app.png)

## Unit Testing

using Mockito and Jacoco report focusing at service.

```bash
mvn test
```

export report at ```./target/site/jacoco```

![](./media/unittest-report.png)

Code coverage

![](./media/unittest-report-cov.png)

## Build

build artifact to .JAR file

```bash
mvn package
```
