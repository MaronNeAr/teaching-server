package com.example.yin.dao.bbs;

import com.example.yin.domain.bbs.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BBSUserMapper {
    List<User> selectAll();
}
