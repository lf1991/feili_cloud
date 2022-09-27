package com.feilis.cloud.controller;

import com.feilis.cloud.bean.Product;
import com.feilis.cloud.bean.User;
import com.feilis.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: TODO
 * @Author feilis
 * @Date 2022/9/6 0:09
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @description: 根据uId获取用户信息
     * @author feilis
     * @Date 2022/9/9 9:44
     * @Param
     * @Return
     */
    @GetMapping("/getUserById/{uId}")
    public User getUserById(@PathVariable("uId") Integer uId) {
        return userService.getUserById(uId);
    }
}
