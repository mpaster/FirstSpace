package com.mpaster.dao;

import com.mpaster.model.Uav;

import java.util.List;

public interface UavMapper {
    int deleteByPrimaryKey(Integer uavId);

    int insert(Uav record);

    int insertSelective(Uav record);

    Uav selectByPrimaryKey(Integer uavId);

    int updateByPrimaryKeySelective(Uav record);

    int updateByPrimaryKeyWithBLOBs(Uav record);

    int updateByPrimaryKey(Uav record);
    
    List<Uav> selectAll();
}