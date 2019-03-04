package com.autentia.spring.cloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;


/**
 * Aplication Config Server
 * @author mike
 *
 */
@EnableAutoConfiguration
@EnableConfigServer
public class ApplicationConfigServer {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfigServer.class, args);
	}

}