package com.shanto.microservice.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
//@ConditionalOnProperty(
//		value = {"eureka.client.register-with-eureka",
//				"eureka.client.fetch-registry"},
//		matchIfMissing = false
//)

//"spring.cloud.service-registry.auto-registration.enabled",
//		"spring.cloud.discovery.enabled",
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

}
