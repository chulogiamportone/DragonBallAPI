package com.SaiyanWorld.DragonBall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SaiyanWorld.DragonBall.model.Personage;

public interface PersonageRepository extends JpaRepository<Personage, Long> {
	
}
