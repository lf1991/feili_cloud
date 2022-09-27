package com.feilis.cloud.service.impl;

import com.feilis.cloud.bean.Order;
import com.feilis.cloud.bean.Product;
import com.feilis.cloud.dao.OrderDao;
import com.feilis.cloud.service.OrderService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @Description: TODO
 * @Author feilis
 * @Date 2022/9/8 1:39
 */

@Service

public class OrderServiceImpl implements OrderService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Mapper
    private OrderDao orderDao;


    @Override
    public Order prod(Integer pId) {

        //从 nacos 注册中心中获取服务商品服务信息
        ServiceInstance instance = discoveryClient.getInstances("shop-product").get(0);
        String host = instance.getHost();
        Integer port = instance.getPort();
        String serviceId = instance.getServiceId();

        String baseUrl = "http://" + host + ":" + port + "/" + serviceId ;
        String url =baseUrl+"/product/getProductById/" + pId;
        Product product = restTemplate.getForObject(url, Product.class);

        Order order=new Order();

        return order;
    }

    @Override
    public Integer saveOrder(Order order) {
        return orderDao.saveOrder(order);
    }
}
