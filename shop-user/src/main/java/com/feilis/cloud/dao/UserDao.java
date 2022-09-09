package com.feilis.cloud.dao;

import com.feilis.cloud.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description: TODO
 * @Author feilis
 * @Date 2022/9/9 9:47
 */
@Mapper
public interface UserDao {
    User getUserById(Integer uId);
}
