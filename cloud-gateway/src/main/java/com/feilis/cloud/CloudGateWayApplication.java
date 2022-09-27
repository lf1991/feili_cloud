package com.feilis.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description: TODO
 * @Author feilis
 * @Date 2022/9/21 23:47
 */

@SpringBootApplication
@EnableDiscoveryClient
public class CloudGateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudGateWayApplication.class, args);
    }
}
