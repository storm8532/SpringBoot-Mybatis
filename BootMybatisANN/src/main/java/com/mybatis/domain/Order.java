package com.mybatis.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/3/8 0008.
 */
public class Order {
    private Long id;
    private Customer customer;
    private Date date;
    private List<Good> goods;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }
}
