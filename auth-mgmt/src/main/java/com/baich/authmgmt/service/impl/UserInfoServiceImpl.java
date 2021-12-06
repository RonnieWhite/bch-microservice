package com.baich.authmgmt.service.impl;

import com.baich.authmgmt.mapper.UserInfoMapper;
import com.baich.authmgmt.model.UserInfo;
import com.baich.authmgmt.model.UserInfoExample;
import com.baich.authmgmt.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created By IDEA.
 * Author : BaiCH
 * Date : Created in 2021-11-21
 * Time : 00:29
 * Description:
 * Modified By:
 * version : v1.0
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    //    @Override
    public List<UserInfo> get() {

        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andUserIdEqualTo(1);
        return userInfoMapper.selectByExample(userInfoExample);
    }
}
