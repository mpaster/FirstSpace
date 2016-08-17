package com.mpaster.dao;

import java.util.List;

import com.mpaster.model.Message;

public interface MessageMapper {
    int deleteByPrimaryKey(Integer mesgeId);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer mesgeId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
    
    List<Message> selectAll();
}