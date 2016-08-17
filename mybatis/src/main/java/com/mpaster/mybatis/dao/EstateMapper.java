package com.mpaster.mybatis.dao;

import com.mpaster.mybatis.entity.Estate;

public interface EstateMapper {
    int deleteByPrimaryKey(String id);

    int insert(Estate record);

    int insertSelective(Estate record);

    Estate selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Estate record);

    int updateByPrimaryKey(Estate record);
}