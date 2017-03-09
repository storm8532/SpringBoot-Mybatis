package com.mybatis.dao;

import com.mybatis.domain.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2017/3/9 0009.
 */
@Mapper
public interface OrderDao {
    List<Order> findAll();
}
