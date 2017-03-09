package com.mybatis.domain;

/**
 * Created by Administrator on 2017/3/9 0009.
 */
public class OrderGood {
    private Long id;
    private Order order;
    private Good good;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }
}
