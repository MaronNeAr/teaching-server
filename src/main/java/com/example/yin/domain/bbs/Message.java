package com.example.yin.domain.bbs;

import java.util.Date;

public class Message {
    Integer mid;

    String content;

    Date date;

    Integer cid;

    Integer uid;

    public Message() {
    }

    public Message(Integer mid, String content, Date date, Integer cid, Integer uid) {
        this.mid = mid;
        this.content = content;
        this.date = date;
        this.cid = cid;
        this.uid = uid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Message{" +
                "mid=" + mid +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", cid=" + cid +
                ", uid=" + uid +
                '}';
    }
}
