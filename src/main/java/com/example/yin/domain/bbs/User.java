package com.example.yin.domain.bbs;

public class User {
    Integer uid;

    String name;

    String picSrc;

    public User(){

    }

    public User(Integer uid, String name, String picSrc) {
        this.uid = uid;
        this.name = name;
        this.picSrc = picSrc;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicSrc() {
        return picSrc;
    }

    public void setPicSrc(String picSrc) {
        this.picSrc = picSrc;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + uid +
                ", name='" + name + '\'' +
                ", picSrc='" + picSrc + '\'' +
                '}';
    }
}
