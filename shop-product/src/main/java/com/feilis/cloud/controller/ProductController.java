package com.feilis.cloud.controller;

import com.feilis.cloud.bean.Product;
import com.feilis.cloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author feilis
 * @Date 2022/9/7 9:39
 */

@RestController
@RequestMapping("/product")
public class ProductController {


    @Autowired
    private ProductService productService;

    /**
     * @description: 通过pid获取产品信息
     * @author feilis
     * @Date 2022/9/7 9:41
     * @Param pId
     * @Return Product
     */
    @GetMapping("/getProductById/{pid}")
    public Product getProductById(@PathVariable("pid") Integer pId) {
        return productService.getProductById(pId);
    }
}
