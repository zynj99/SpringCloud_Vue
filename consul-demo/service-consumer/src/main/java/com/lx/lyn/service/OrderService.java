package com.lx.lyn.service;

import com.lx.lyn.pojo.Order;

/**
 * @author 刘怡男
 * @version 2020/7/16 - 16:52
 */
public interface OrderService {

    /**
     * 根据主键查询订单
     * @param id
     * @return
     */
    Order selectOrderById(Integer id);
}
