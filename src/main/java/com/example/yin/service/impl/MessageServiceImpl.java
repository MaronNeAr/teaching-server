package com.example.yin.service.impl;

import com.example.yin.dao.bbs.MessageMapper;
import com.example.yin.domain.bbs.Message;
import com.example.yin.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public List<Message> getMessageByCid(Integer cid) {
        return messageMapper.selectAllByCid(cid);
    }

    @Override
    public boolean addMessage(Message message) {
        return messageMapper.addMessage(message) > 0;
    }
}
