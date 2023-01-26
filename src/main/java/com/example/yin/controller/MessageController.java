package com.example.yin.controller;

import com.example.yin.common.SuccessMessage;
import com.example.yin.domain.bbs.Message;
import com.example.yin.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

@RestController
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping("/bbs/{cid}")
    public Object getMessage(@PathVariable("cid") Integer cid) throws ParseException {
        return new SuccessMessage<List<Message>>(null, messageService.getMessageByCid(cid)).getMessage();
    }

    @PostMapping("/send")
    public Object sendMessage(HttpServletRequest req) {
        Message message = new Message();
        message.setContent(req.getParameter("content"));
        message.setDate(new Date());
        message.setCid(Integer.valueOf(req.getParameter("cid")));
        message.setUid(Integer.valueOf(req.getParameter("uid")));
        return new SuccessMessage<Boolean>("发送成功", messageService.addMessage(message)).getMessage();
    }
}
