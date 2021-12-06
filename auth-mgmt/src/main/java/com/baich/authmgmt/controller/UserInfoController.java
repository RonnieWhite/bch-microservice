package com.baich.authmgmt.controller;

import com.baich.authmgmt.model.UserInfo;
import com.baich.authmgmt.service.UserInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    @GetMapping("/get")
    public String get() {
        List<UserInfo> userInfoList = userInfoService.get();
        return userInfoList.toString();
    }
}
