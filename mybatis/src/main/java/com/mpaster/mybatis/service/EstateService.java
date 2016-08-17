package com.mpaster.mybatis.service;

import com.mpaster.mybatis.dao.EstateMapper;
import com.mpaster.mybatis.entity.Estate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mpaster on 2016/8/17.
 */

@Service
public class EstateService implements IEstateService {

    @Autowired
    private EstateMapper estateMapper;

    public Estate getEstateById(String id) {
        return estateMapper.selectByPrimaryKey(id);
    }
}
