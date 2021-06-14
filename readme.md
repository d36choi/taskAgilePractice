## 준비
application-dev.properties 생성 후 아래 세팅
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/task_agile?useSSL=false
spring.datasource.username=<username>
spring.datasource.password=<password>
```
## 빌드
`mvn clean install`
