package com.baich.authmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created By IDEA.
 * Author : BaiCH
 * Date : Created in 2021-11-20
 * Time : 22:31
 * Description:
 * Modified By:
 * version : v1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AuthorityManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthorityManagementApplication.class, args);
    }
}
