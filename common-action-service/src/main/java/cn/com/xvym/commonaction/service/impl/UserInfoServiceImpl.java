package cn.com.xvym.commonaction.service.impl;

import cn.com.xvym.commonaction.dal.entity.UserInfoEntity;
import cn.com.xvym.commonaction.dal.mapper.UserInfoMapper;
import cn.com.xvym.commonaction.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Xv
 * @Date: 2022/2/21 0:15
 * @Description:
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfoEntity login() {
        return userInfoMapper.selectByPrimaryKey(1L);
    }
}
