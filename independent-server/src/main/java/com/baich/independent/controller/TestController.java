package com.baich.independent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By IDEA.
 * Author : BaiCH
 * Date : Created in 2021-12-12
 * Time : 10:10
 * Description:
 * Modified By:
 * version : v1.0
 */
@RestController
@RequestMapping(value = "/independent")
public class TestController {

    @GetMapping(value = "/test")
    public String test() {
        return "You are attacked......";
    }
}
