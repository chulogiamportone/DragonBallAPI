package com.SaiyanWorld.DragonBall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SaiyanWorld.DragonBall.iService.IPersonageService;
import com.SaiyanWorld.DragonBall.model.Personage;



@RestController
@RequestMapping("/api/characters")
public class PersonageController {

	@Autowired
    private IPersonageService pService;

    @GetMapping
    public List<Personage> getAllCharacters() {
        return pService.findAllCharacters();
    }

    @PostMapping
    public Personage createCharacter(@RequestBody Personage personage) {
        return pService.saveCharacter(personage);
    }
}
