package com.cjw.entity;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * @author codeAC
 * @date 2018/6/3 17:09
 */
@Alias("orders")
public class Order {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private int id;

    private Integer userId;

    private String number;

    private Date createtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    private String note;

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", userId=" + userId + ", number='" + number + '\'' + ", createtime=" + createtime + ", note='" + note + '\'' + '}';
    }
}
