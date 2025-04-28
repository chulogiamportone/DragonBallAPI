package com.SaiyanWorld.DragonBall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SaiyanWorld.DragonBall.iService.IPlanetService;
import com.SaiyanWorld.DragonBall.model.Planet;
import com.SaiyanWorld.DragonBall.repository.PlanetRepository;


@Service
public class PlanetService  implements IPlanetService {

	@Autowired
    private PlanetRepository pRepository;

    public List<Planet> findAllCharacters() {
        return pRepository.findAll();
    }

    public Planet saveCharacter(Planet planet) {
        return pRepository.save(planet);
    }

}
