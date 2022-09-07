package com.feilis.cloud.service;

import com.feilis.cloud.bean.Product;

/**
 * @Description: TODO
 * @Author feilis
 * @Date 2022/9/7 9:42
 */
public interface ProductService {
    Product getProductById(Integer pId);
}
