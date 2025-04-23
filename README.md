# Example Java SDK version 0.1

![Build](https://img.shields.io/badge/build-passing-brightgreen)
![JDK](https://img.shields.io/badge/jdk-11+-blue)
![License](https://img.shields.io/badge/license-MIT-green)
![Status](https://img.shields.io/badge/status-alpha-orange)

A lightweight Java SDK for consuming the Example API 
```java
"/api/get/example"
```

## Installation
### Build the project:
- Normal jar:
```bash
./gradlew assemble
```
- Sources jar:
```bash
./gradlew sourcesJar
```
- JavaDoc jar:
```bash
./gradlew javadocJar
```

### Usage
```gradle
implementation files('libs/ExampleSdk-0.1.jar')
```
- Create client:
```java
ExampleClient client = new ExampleClient("https://your-api-host.com");
````
- Get response:
```java
ExampleRspDto response = client.getExample();
```
- Response schema:
```json
{
  "exampleOne": "value1",
  "exampleTwo": "value2",
  "exampleThree": "value3"
}
```

## Requirements
- Java 11+
- Gradle 7+

