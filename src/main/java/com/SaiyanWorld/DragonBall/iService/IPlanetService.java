package com.SaiyanWorld.DragonBall.iService;

import java.util.List;

import com.SaiyanWorld.DragonBall.model.Planet;

public interface IPlanetService {
	public List<Planet> findAllCharacters();
    public Planet saveCharacter(Planet planet);

}
