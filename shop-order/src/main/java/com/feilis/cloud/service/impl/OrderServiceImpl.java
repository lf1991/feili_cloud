package com.feilis.cloud.service.impl;

import com.feilis.cloud.bean.Order;
import com.feilis.cloud.bean.Product;
import com.feilis.cloud.dao.OrderDao;
import com.feilis.cloud.service.OrderService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: TODO
 * @Author feilis
 * @Date 2022/9/8 1:39
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private RestTemplate restTemplate;

    @Mapper
    private OrderDao orderDao;

    @Override
    public Order prod(Integer pId) {
        String url = "http://localhost:9092/shop-product/product/getProductById/" + pId;
        Product product = restTemplate.getForObject(url, Product.class);
        return new Order();
    }

    @Override
    public Integer saveOrder(Order order) {
        return orderDao.saveOrder(order);
    }
}
