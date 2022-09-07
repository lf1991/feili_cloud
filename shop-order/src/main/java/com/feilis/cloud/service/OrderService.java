package com.feilis.cloud.service;

import com.feilis.cloud.bean.Order;

/**
 * @Description: TODO
 * @Author feilis
 * @Date 2022/9/8 1:38
 */
public interface OrderService {

    public Order prod(Integer pid);

    public Integer saveOrder(Order order);
}
