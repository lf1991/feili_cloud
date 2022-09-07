package com.feilis.cloud.dao;

import com.feilis.cloud.bean.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description: TODO
 * @Author feilis
 * @Date 2022/9/8 1:27
 */

@Mapper
public interface OrderDao {

    Integer saveOrder(Order order);
}
