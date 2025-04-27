package com.SaiyanWorld.DragonBall.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SaiyanWorld.DragonBall.iService.IPersonageService;
import com.SaiyanWorld.DragonBall.model.Personage;
import com.SaiyanWorld.DragonBall.repository.PersonageRepository;

@Service
public class PersonageService implements IPersonageService {

	@Autowired
    private PersonageRepository pRepository;

    public List<Personage> findAllCharacters() {
        return pRepository.findAll();
    }

    public Personage saveCharacter(Personage personage) {
        return pRepository.save(personage);
    }
}
