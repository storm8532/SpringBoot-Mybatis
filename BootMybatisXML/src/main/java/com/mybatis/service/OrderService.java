package com.mybatis.service;

import com.mybatis.dao.OrderDao;
import com.mybatis.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/3/9 0009.
 */
@Service
@Transactional
public class OrderService {
    @Autowired
    private OrderDao orderDao;

    public List<Order> findAll() {
        List<Order> orders = orderDao.findAll();
        return orders;
    }
}
