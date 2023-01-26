package com.example.yin.service.impl;

import com.example.yin.dao.bbs.BBSUserMapper;
import com.example.yin.domain.bbs.User;
import com.example.yin.service.BBSUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BBSUserServiceImpl implements BBSUserService {
    @Autowired
    private BBSUserMapper bbsUserMapper;

    @Override
    public List<User> getUsers() {
        return bbsUserMapper.selectAll();
    }
}
