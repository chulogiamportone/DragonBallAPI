package com.SaiyanWorld.DragonBall.iService;

import java.util.List;
import com.SaiyanWorld.DragonBall.model.Power;

public interface IPowerService {
	

    public List<Power> findAllCharacters() ;

    public Power saveCharacter(Power power) ;
}
