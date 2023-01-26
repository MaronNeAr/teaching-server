package com.example.yin.dao.bbs;

import com.example.yin.domain.bbs.Message;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageMapper {

    List<Message> selectAllByCid(@Param("cid") Integer cid);

    int addMessage(Message message);
}
