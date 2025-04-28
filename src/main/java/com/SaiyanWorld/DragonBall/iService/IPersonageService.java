package com.SaiyanWorld.DragonBall.iService;

import java.util.List;


import com.SaiyanWorld.DragonBall.model.Personage;

public interface IPersonageService {

	public List<Personage> findAllCharacters();
    public Personage saveCharacter(Personage personage);
}
