package com.mybatis.web;

import com.mybatis.domain.Good;
import com.mybatis.domain.OrderGoodMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/9 0009.
 */
@RestController
@RequestMapping(value = "/og")
public class OrderGoodController {
    @Autowired
    private OrderGoodMapper orderGoodMapper;

    @RequestMapping(value = "/sgs/{orderId}")
    public List<Good> selectGoodsByOrderId(@PathVariable Long orderId) {
        List<Good> goods = new ArrayList<Good>();
        goods = orderGoodMapper.selectGoodsByOrderId(orderId);
        return goods;
    }
}
