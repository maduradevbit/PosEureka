package com.techfx.microservices.techefxspringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication

@EnableConfigServer
public class TechefxSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechefxSpringCloudConfigServerApplication.class, args);
	}

}
