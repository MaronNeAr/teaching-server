package com.example.yin.domain.bbs;

public class Channel {
    Integer cid;

    String name;

    String picSrc;

    public Channel(Integer cid, String name, String picSrc) {
        this.cid = cid;
        this.name = name;
        this.picSrc = picSrc;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
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
        return "Channel{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", picSrc='" + picSrc + '\'' +
                '}';
    }
}
