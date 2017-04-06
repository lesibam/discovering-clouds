## IQ Eureka Client using Spring Boot Cloud. 

##### Starting The Application:  
- It is assumed the Eureka is running successfully and that you have the Java JDK installed. 
- Use the embedded Maven Script and Run ```sh $ ./mvnw clean install -U``` 
once the build it complete. To start up the server ```sh $ ./mvnw spring-boot:run ```
- If Application started successfully, navigate to the Eureka Server on `http://127.0.0.1:8761`. The Server should have discovered the Client. 
- To see if the client is successfully started. Call `http://127.0.0.1:8001/service-instances/iq-eureka-cloud-client/` and let the magic begin. 
