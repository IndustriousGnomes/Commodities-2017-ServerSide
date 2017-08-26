# Commodities-2017-ServerSide

## This is the Server Side code for the Commodities-2017 project.

### Technology Stack
- Java 8
- REST
- SpringBoot 1.5.6

### Testing
- Spock
- Groovy
- Jacoco

### Deployment Pipeline
- Docker
- Drone

## How to build/deploy Docker image

```
$ ./gradlew buildDocker

$ docker run -t -p 8080:8080 igcommodities:0.0.1-SNAPSHOT
```
