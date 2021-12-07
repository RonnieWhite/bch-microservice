package com.baich.dailyaffairs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created By IDEA.
 * Author : BaiCH
 * Date : Created in 2021-12-07
 * Time : 11:38
 * Description:
 * Modified By:
 * version : v1.0
 */
@RestController
@RequestMapping("/affairs")
@RefreshScope
public class TestController {

    private final RestTemplate restTemplate;

    @Autowired
    public TestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/echo/{str}")
    public String echo(@PathVariable String str) {

        return restTemplate.getForObject("http://auth-mgmt-provider/auth/echo/" + str, String.class);
    }
}
