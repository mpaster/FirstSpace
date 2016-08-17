package com.mpaster.service;

import java.util.List;

import com.mpaster.model.Uav;

public interface IUavService {

	Uav getUav(int uavId);
	
	void addUav(Uav uav);
	
	void deleteUav(int uavId);
	
	void updateUav(Uav uav);
	
	List<Uav> getAll();
}
