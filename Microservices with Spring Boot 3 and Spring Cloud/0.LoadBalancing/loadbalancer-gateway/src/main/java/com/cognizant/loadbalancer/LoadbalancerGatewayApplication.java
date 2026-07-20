package com.cognizant.loadbalancer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoadbalancerGatewayApplication {

    public static void main(String[] args) {

        SpringApplication.run(
                LoadbalancerGatewayApplication.class,
                args);

    }

}