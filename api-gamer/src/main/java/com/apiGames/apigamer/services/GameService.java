package com.apiGames.apigamer.services;


import com.apiGames.apigamer.dto.GameDTO;
import com.apiGames.apigamer.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll() {
        var result = gameRepository.findAll();
        return  result.stream().map(GameDTO::new).toList();
    }

}
