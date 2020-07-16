package com.lx.lyn.service.impl;

import com.lx.lyn.pojo.Product;
import com.lx.lyn.service.ProductService;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author 刘怡男
 * @version 2020/7/16 - 16:25
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> selectProductList() {
        return Arrays.asList(
                new Product(1,"华为手机", 3, 5000d),
                new Product(2,"小米手机", 5, 2000d),
                new Product(3,"联想笔记本", 10 ,7000d));
    }
}
