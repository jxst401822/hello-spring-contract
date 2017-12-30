package org.amuji.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.stubrunner.server.EnableStubRunnerServer;

@SpringBootApplication
@EnableStubRunnerServer
//@AutoConfigureStubRunner(ids = "org.amuji:http-server-producer:+:stubs:8095", workOffline = false)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
