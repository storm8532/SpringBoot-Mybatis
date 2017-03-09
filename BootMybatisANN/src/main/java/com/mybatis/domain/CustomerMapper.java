package com.mybatis.domain;

import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Administrator on 2017/3/8 0008.
 */
@Mapper
public interface CustomerMapper {

    //查询所有
    @Select("SELECT ID, NAME, ADDR FROM CUSTOMER")
    List<Customer> selectAll();

    //根据id查
    @Select("SELECT ID, NAME, ADDR FROM CUSTOMER WHERE ID=#{id}")
    Customer selectCustomerById(Long id);

    //插入数据
    @Insert("INSERT INTO CUSTOMER(NAME, ADDR) VALUES(#{name},#{addr})")
    Long insertCustomer(Customer customer);

    //更新数据
    @Update("UPDATE CUSTOMER SET NAME=#{name}, ADDR=#{addr} WHERE ID=#{id}")
    Long updateCustomer(Customer customer);

    //根据id删除
    @Delete("DELETE FROM CUSTOMER WHERE ID=#{id}")
    Long deleteCustomerById(Long id);
}
