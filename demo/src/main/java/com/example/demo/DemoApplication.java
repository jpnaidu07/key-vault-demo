package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	@Value("${yourSecretPropertyName}")
	private String mySecretProperty;

	@Value("${yourSecretPropertyName1}")
	private String mySecretProperty1;

	@Value("${yourSecretPropertyName2}")
	private String mySecretProperty2;

	@Value("${yourSecretPropertyName3}")
	private String mySecretProperty3;

	@Value("${yourSecretPropertyName4}")
	private String mySecretProperty4;

	@Value("${yourSecretPropertyName5}")
	private String mySecretProperty5;

	@Value("${yourSecretPropertyName6}")
	private String mySecretProperty6;

	@Value("${yourSecretPropertyName7}")
	private String mySecretProperty7;

	@Value("${yourSecretPropertyName8}")
	private String mySecretProperty8;

	@Value("${yourSecretPropertyName9}")
	private String mySecretProperty9;

	@Value("${yourSecretPropertyName10}")
	private String mySecretProperty10;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
