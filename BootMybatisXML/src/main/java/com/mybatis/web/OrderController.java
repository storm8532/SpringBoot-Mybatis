package com.mybatis.web;

import com.mybatis.domain.Order;
import com.mybatis.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/3/9 0009.
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/all")
    public List<Order> findAll() {
        return orderService.findAll();
    }
}
