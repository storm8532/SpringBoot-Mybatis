package com.mybatis.web;

import com.mybatis.domain.Order;
import com.mybatis.domain.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/9 0009.
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;

    //获取所有订单详情
    @RequestMapping(value = "/all")
    public List<Order> selectAll() {
        List<Order> orders = new ArrayList<Order>();
        orders = orderMapper.selectAll();
        return orders;
    }
    //获取所有订单详情
    @RequestMapping(value = "/abp")
    public List<Order> selectAllByProv() {
        List<Order> orders = new ArrayList<Order>();
        orders = orderMapper.selectAllByProv();
        return orders;
    }
}
