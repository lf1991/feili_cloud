package com.feilis.cloud.dao;

import com.feilis.cloud.bean.Product;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description: TODO
 * @Author feilis
 * @Date 2022/9/7 23:29
 */

@Mapper
public interface ProductDao {
    Product getProductById(Integer pId);
}
