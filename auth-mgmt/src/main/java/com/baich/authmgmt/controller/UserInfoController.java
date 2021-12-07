package com.baich.authmgmt.controller;

import com.baich.authmgmt.model.UserInfo;
import com.baich.authmgmt.service.UserInfoService;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created By IDEA.
 * Author : BaiCH
 * Date : Created in 2021-11-21
 * Time : 00:31
 * Description:
 * Modified By:
 * version : v1.0
 */
@RestController
@RequestMapping("/auth")
@RefreshScope
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    @GetMapping("/get")
    public String get() {
        List<UserInfo> userInfoList = userInfoService.get();
        return userInfoList.toString();
    }

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return "Hello Nacos Discovery " + string;

    }
}
