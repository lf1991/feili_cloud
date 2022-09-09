package com.feilis.cloud.service.impl;

import com.feilis.cloud.bean.User;
import com.feilis.cloud.dao.UserDao;
import com.feilis.cloud.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description: user
 * @Author feilis
 * @Date 2022/9/7 9:42
 */
@Service
public class UserServiceImpl implements UserService {


    @Resource
    private UserDao userDao;

    @Override
    public User getUserById(Integer uId) {
        return userDao.getUserById(uId);
    }
}
