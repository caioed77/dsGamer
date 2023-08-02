package com.apiGames.apigamer.controllers;


import com.apiGames.apigamer.dto.GameDTO;
import com.apiGames.apigamer.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/listarGames")
    public ResponseEntity<List<GameDTO>> findGames(){
        return ResponseEntity.ok(gameService.findAll());
    }

}
