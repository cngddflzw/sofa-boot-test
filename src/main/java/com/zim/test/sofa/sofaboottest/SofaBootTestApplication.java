package com.zim.test.sofa.sofaboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({ "classpath*:rpc-starter-example.xml" })
public class SofaBootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SofaBootTestApplication.class, args);
	}
}
