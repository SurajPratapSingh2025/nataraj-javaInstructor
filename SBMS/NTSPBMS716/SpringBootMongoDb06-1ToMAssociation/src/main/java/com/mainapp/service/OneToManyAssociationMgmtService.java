package com.mainapp.service;

import java.util.List;

import com.mainapp.entity.MedalEntity;
import com.mainapp.entity.PlayerEntity;
import com.mainapp.entity.SportEntity;

public interface OneToManyAssociationMgmtService {
	
	public String saveDataUsingPlayer(PlayerEntity player);
	public String saveDataUsingSport(SportEntity sport);
	public String saveDataUsingMedal(MedalEntity medal);
	
	public List<PlayerEntity> showDataUsingPlayer();
	public List<SportEntity> showDataUsingSport();
	public List<MedalEntity> showDataUsingMedal();
	
}
