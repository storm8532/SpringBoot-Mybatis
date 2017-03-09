package com.mybatis.domain;

/**
 * Created by Administrator on 2017/3/8 0008.
 */
public class Customer {
    private Long id;
    private String name;
    private String addr;

    public Customer() {

    }

    public Customer(Long id, String name, String addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }

    public Customer(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
