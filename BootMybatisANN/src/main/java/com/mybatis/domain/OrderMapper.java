package com.mybatis.domain;

import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Administrator on 2017/3/9 0009.
 */
@Mapper
public interface OrderMapper {

    //通过中间表连表查询
    @Select("SELECT * FROM `ORDER`")
    @Results(
            {
                    @Result(id = true, column = "id", property = "id"),
                    @Result(column = "customer_id", property = "customer",
                    one = @One(select = "com.mybatis.domain.CustomerMapper.selectCustomerById")),
                    @Result(column = "date", property = "date"),
                    @Result(column = "id", property = "goods",
                    many = @Many(select = "com.mybatis.domain.OrderGoodMapper.selectGoodsByOrderId"))
            }
    )
    List<Order> selectAll();

    //sqlProvider方式
    @SelectProvider(type = OrderSqlProvider.class, method = "selectAll")
    @Results(
            {
                    @Result(id = true, column = "id", property = "id"),
                    @Result(column = "customer_id", property = "customer",
                            one = @One(select = "com.mybatis.domain.CustomerMapper.selectCustomerById")),
                    @Result(column = "date", property = "date"),
                    @Result(column = "id", property = "goods",
                            many = @Many(select = "com.mybatis.domain.OrderGoodMapper.selectGoodsByOrderId"))
            }
    )
    List<Order> selectAllByProv();
}
