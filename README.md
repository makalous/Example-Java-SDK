# Example Java SDK version 0.1
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
ExampleClient client = new ExampleClient("https://your-api.com");
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

