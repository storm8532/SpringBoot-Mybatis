package com.mybatis.domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2017/3/9 0009.
 */
@Mapper
public interface OrderGoodMapper {

    @Select("SELECT G.ID, G.NAME FROM ORDER_GOOD AS OG LEFT JOIN GOOD AS G ON OG.GOOD_ID=G.ID WHERE ORDER_ID=#{orderid}")
    List<Good> selectGoodsByOrderId(Long orderId);
}
