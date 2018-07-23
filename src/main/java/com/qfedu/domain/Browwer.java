package com.qfedu.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 *@Author feri
 *@Date Created in 2018/7/23 15:20
 * 借款表
 */
public class Browwer {
    private int id;
    private int money;//借款金额
    private double lx;//利息
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startDate;//开始日期
    private long month;//时长 月份

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public double getLx() {
        return lx;
    }

    public void setLx(double lx) {
        this.lx = lx;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public long getMonth() {
        return month;
    }

    public void setMonth(long month) {
        this.month = month;
    }
}
