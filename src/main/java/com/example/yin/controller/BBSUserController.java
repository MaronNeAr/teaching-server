package com.example.yin.controller;

import com.example.yin.common.SuccessMessage;
import com.example.yin.domain.bbs.User;
import com.example.yin.service.BBSUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BBSUserController {
    @Autowired
    private BBSUserService bbsUserService;

    @GetMapping("/users")
    public Object getUsers() {
        return new SuccessMessage<List<User>>(null, bbsUserService.getUsers()).getMessage();
    }
}
