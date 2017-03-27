package net.iqbusiness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class IqEurikaCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(IqEurikaCloudApplication.class, args);
	}
}
