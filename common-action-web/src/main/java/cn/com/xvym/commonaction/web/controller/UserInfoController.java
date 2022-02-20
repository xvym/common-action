package cn.com.xvym.commonaction.web.controller;

import cn.com.xvym.commonaction.dal.entity.UserInfoEntity;
import cn.com.xvym.commonaction.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Xv
 * @Date: 2022/2/21 0:16
 * @Description:
 */
@RestController
@RequestMapping("/common-action/user-info")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("login")
    public String login() {
        UserInfoEntity userInfoEntity = userInfoService.login();
        return "success";
    }

}
