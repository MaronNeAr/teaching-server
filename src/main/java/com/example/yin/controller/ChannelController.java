package com.example.yin.controller;

import com.example.yin.common.SuccessMessage;
import com.example.yin.domain.bbs.Channel;
import com.example.yin.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChannelController {
    @Autowired
    private ChannelService channelService;

    @GetMapping("/channel")
    public Object getChannels(){
        return new SuccessMessage<List<Channel>>(null, channelService.getChannels()).getMessage();
    }
}
