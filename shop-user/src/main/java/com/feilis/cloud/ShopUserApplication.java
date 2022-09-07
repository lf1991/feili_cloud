package com.feilis.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description: TODO
 * @Author feilis
 * @Date 2022/9/5 10:13
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
@MapperScan("com.feilis.cloud.mapper")
public class ShopUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopUserApplication.class, args);
    }
}
