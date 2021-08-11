package com.hp.bean;

import java.util.Date;

public class Student {

    private int id;
    private String name;
    private int age;
    private String classs;
    private Date birthday;
    private boolean isShen;

    public boolean isShen() {
        return isShen;
    }

    public void setShen(boolean shen) {
        isShen = shen;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classs='" + classs + '\'' +
                ", birthday=" + birthday +
                ", isShen=" + isShen +
                '}';
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
