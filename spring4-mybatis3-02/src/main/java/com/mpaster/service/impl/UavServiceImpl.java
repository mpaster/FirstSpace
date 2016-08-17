package com.mpaster.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mpaster.dao.UavMapper;
import com.mpaster.model.Uav;
import com.mpaster.service.IUavService;

@Service("uavService")
public class UavServiceImpl implements IUavService {

	@Resource
	private UavMapper uavMapper;

	@Override
	public Uav getUav(int uavId) {
		return this.uavMapper.selectByPrimaryKey(uavId);
	}

	@Override
	public void addUav(Uav uav) {
		this.uavMapper.insert(uav);
	}

	@Override
	public void deleteUav(int uavId) {
		this.uavMapper.deleteByPrimaryKey(uavId);
		
	}

	@Override
	public void updateUav(Uav uav) {
		this.uavMapper.updateByPrimaryKey(uav);
		
	}

	@Override
	public List<Uav> getAll() {
		return this.uavMapper.selectAll();
	}
	
	
}
