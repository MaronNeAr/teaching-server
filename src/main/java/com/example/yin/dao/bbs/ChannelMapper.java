package com.example.yin.dao.bbs;

import com.example.yin.domain.bbs.Channel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChannelMapper {
    List<Channel> selectAll();
}
