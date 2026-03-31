package com.mainapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mainapp.entity.MedalEntity;
import com.mainapp.entity.PlayerEntity;
import com.mainapp.entity.SportEntity;
import com.mainapp.repository.MedalRepository;
import com.mainapp.repository.PlayerRepository;
import com.mainapp.repository.SportRepository;

@Service
public class OneToManyAssociationMgmtServiceImpl implements OneToManyAssociationMgmtService{
	
	@Autowired
	private PlayerRepository playerRepo;
	@Autowired
	private SportRepository sportRepo;
	@Autowired
	private MedalRepository medalRepo;
	@Override
	public String saveDataUsingPlayer(PlayerEntity player) {
		Integer idVal = playerRepo.save(player).getPid();
		return "Person object & its associated DrivingLicense & Medal object is saved with the id value: "+idVal;
	}
	@Override
	public String saveDataUsingSport(SportEntity sport) {
		Integer idVal = sportRepo.save(sport).getSid();
		return "Sport object & its associated DrivingLicense & Player object is saved with the id value: "+idVal;
	}
	@Override
	public String saveDataUsingMedal(MedalEntity medal) {
		Integer idVal = medalRepo.save(medal).getMid();
		return "Medal object & its associated DrivingLicense & Player object is saved with the id value: "+idVal;
	}
	@Override
	public List<PlayerEntity> showDataUsingPlayer() {
		return playerRepo.findAll();
	}
	@Override
	public List<SportEntity> showDataUsingSport() {
		return sportRepo.findAll();
	}
	@Override
	public List<MedalEntity> showDataUsingMedal() {
		return medalRepo.findAll();
	}
	
	
	
	
}
