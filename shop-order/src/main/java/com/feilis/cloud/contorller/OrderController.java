package com.feilis.cloud.contorller;

import com.feilis.cloud.bean.Order;
import com.feilis.cloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author feilis
 * @Date 2022/9/8 1:33
 */

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * @description: 购买商品
     * @author feilis
     * @Date 2022/9/8 1:36
     * @Param
     * @Return
     */
    @GetMapping("/prod/{pid}")
    public Order prod(@PathVariable("pid") Integer pid) {
        return orderService.prod(pid);
    }
}
