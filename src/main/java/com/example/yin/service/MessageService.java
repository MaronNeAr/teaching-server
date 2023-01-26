package com.example.yin.service;

import com.example.yin.domain.bbs.Message;

import java.util.List;

public interface MessageService {
    List<Message> getMessageByCid(Integer cid);

    boolean addMessage(Message message);
}
