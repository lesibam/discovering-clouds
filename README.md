# Discovering Clouds
Proof of concept using Springboot with Spring Cloud discovery. 

This repository consists of two projects: The Discovery Server and The Client. 

One of the challenges with the Microservices approach is managing the discovery of web services. 
There are serveral OpenSource alternatives such as Eureka (which comes from the Netflix OSS), Consul, etc. that attempt to solve this challenge. 

In this exercise we take a specific look at Eureka and it's benefits. 

Eureka with the  help of Zuul (an edge service that provides dynamic routing, monitoring, resiliency, security, and more.) can be used for Server and Client load balancing, even JavaScript clients [Example here](https://www.npmjs.com/package/eureka-js-client).
The Server can be deployed or self-launched as runnable jar.

But for the purpose of this this exercise we will only focus on creating the Server and a Spring Boot REST Client.
