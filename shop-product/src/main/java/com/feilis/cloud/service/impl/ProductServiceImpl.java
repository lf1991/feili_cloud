package com.feilis.cloud.service.impl;

import com.feilis.cloud.bean.Product;
import com.feilis.cloud.dao.ProductDao;
import com.feilis.cloud.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * @Description: TODO
 * @Author feilis
 * @Date 2022/9/7 9:42
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer pId) {
        return productDao.getProductById(pId);
    }

}
