package com.SaiyanWorld.DragonBall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SaiyanWorld.DragonBall.iService.IPlanetService;
import com.SaiyanWorld.DragonBall.model.Planet;



@RestController
@RequestMapping("/api/characters/planet")
public class PlanetController {

	@Autowired
	private IPlanetService pService;

	@GetMapping
	public List<Planet> getAllCharacters() {
		return pService.findAllCharacters();
		}
	@PostMapping
	public Planet createCharacter(@RequestBody Planet planet) {
		return pService.saveCharacter(planet);
		}
}
