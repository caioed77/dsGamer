package com.apiGames.apigamer.repositories;

import com.apiGames.apigamer.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
