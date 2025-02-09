package com.springboot.compute.cloud_vendor_query_service;

import org.springframework.boot.SpringApplication;

public class TestCloudVendorQueryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(CloudVendorQueryServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
