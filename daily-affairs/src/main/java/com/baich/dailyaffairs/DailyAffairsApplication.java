package com.baich.dailyaffairs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created By IDEA.
 * Author : BaiCH
 * Date : Created in 2021-12-07
 * Time : 09:55
 * Description:
 * Modified By:
 * version : v1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DailyAffairsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DailyAffairsApplication.class, args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
