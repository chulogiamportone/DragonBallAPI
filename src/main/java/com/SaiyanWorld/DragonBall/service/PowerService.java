package com.SaiyanWorld.DragonBall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SaiyanWorld.DragonBall.iService.IPowerService;
import com.SaiyanWorld.DragonBall.model.Power;
import com.SaiyanWorld.DragonBall.repository.PowerRepository;
@Service
public class PowerService implements IPowerService {

	@Autowired
	private PowerRepository pRepository;

	public List<Power> findAllCharacters() {
			return pRepository.findAll();
	}

	public Power saveCharacter(Power power) {
			return pRepository.save(power);
		}
}
