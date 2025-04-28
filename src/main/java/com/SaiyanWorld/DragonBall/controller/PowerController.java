package com.SaiyanWorld.DragonBall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SaiyanWorld.DragonBall.iService.IPowerService;
import com.SaiyanWorld.DragonBall.model.Power;



@RestController
@RequestMapping("/api/characters/power")
public class PowerController {

	@Autowired
	   private IPowerService pService;

	@GetMapping
	  public List<Power> getAllCharacters() {
	      return pService.findAllCharacters();
	  }

	@PostMapping
	  public Power createCharacter(@RequestBody Power power) {
		return pService.saveCharacter(power);
	}
}
