package com.example.yin.service.impl;

import com.example.yin.dao.bbs.ChannelMapper;
import com.example.yin.domain.bbs.Channel;
import com.example.yin.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelServiceImpl implements ChannelService {
    @Autowired
    private ChannelMapper channelMapper;

    @Override
    public List<Channel> getChannels() {
        return channelMapper.selectAll();
    }
}
