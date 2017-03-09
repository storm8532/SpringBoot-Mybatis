package com.mybatis.web;

import com.mybatis.domain.Customer;
import com.mybatis.domain.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/8 0008.
 */
@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerMapper customerMapper;

    @RequestMapping(value = "/all")
    public List<Customer> selectAll() {
        List<Customer> customers = new ArrayList<Customer>();
        customers = customerMapper.selectAll();
        return customers;
    }

    @RequestMapping(value = "/one/{id}")
    public Customer selectCustomerByid(@PathVariable Long id) {
        Customer customer = customerMapper.selectCustomerById(id);
        return customer;
    }

    @RequestMapping(value = "/insert")
    public String insertCustomer() {
        Customer customer = new Customer();
        customer.setName("僵硬");
        customer.setAddr("666666");
        try {
            customerMapper.insertCustomer(customer);
            return "insert success";
        } catch (Exception e) {
            e.printStackTrace();
            return "insert failure";
        }
    }

    @RequestMapping(value = "/update/{id}")
    public String updateCustomer(@PathVariable Long id) {
        Customer customer = customerMapper.selectCustomerById(id);
        customer.setAddr("鱼塘");
        try {
            customerMapper.updateCustomer(customer);
            return "update success";
        } catch (Exception e) {
            e.printStackTrace();
            return "update failure";
        }
    }

    @RequestMapping(value = "/delete/{id}")
    public String deleteCustomerById(@PathVariable Long id) {
        try {
            customerMapper.deleteCustomerById(id);
            return "delete success";
        } catch (Exception e) {
            e.printStackTrace();
            return "delete failure";
        }
    }
}
