package com.lx.lyn.service;

import com.lx.lyn.pojo.Product;

import java.util.List;

/**
 * @author 刘怡男
 * @version 2020/7/16 - 16:23
 * 商品服务
 */
public interface ProductService {

    /**
     * 查询商品列表
     * @return
     */
    List<Product> selectProductList();
}
