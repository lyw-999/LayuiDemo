package com.hp.bean;

public class Tab {

    private int id;
    private String bid;
    private String name;
    private int count;
    private String lever;
    private String yname;
    private String ytype;

    @Override
    public String toString() {
        return "Tab{" +
                "id=" + id +
                ", bid=" + bid +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", lever='" + lever + '\'' +
                ", yname='" + yname + '\'' +
                ", ytype='" + ytype + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getLever() {
        return lever;
    }

    public void setLever(String lever) {
        this.lever = lever;
    }

    public String getYname() {
        return yname;
    }

    public void setYname(String yname) {
        this.yname = yname;
    }

    public String getYtype() {
        return ytype;
    }

    public void setYtype(String ytype) {
        this.ytype = ytype;
    }
}
