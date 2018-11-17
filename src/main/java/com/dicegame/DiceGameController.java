package com.dicegame;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DiceGameController
{
    GameController gameController = new GameController();


    @RequestMapping(value = "/createPlayer", method = RequestMethod.POST)
    public String createPlayer(@RequestParam("name") String name)
    {
        gameController.createPlayer(name);
        return "Player: " + name + " created.";
    }

    @RequestMapping(value = "/playGame", method = RequestMethod.GET)
    public String playGame()
    {
        return gameController.play();
    }

    @RequestMapping(value = "/listResults", method = RequestMethod.GET)
    public List<DiceRollResult> listResults()
    {
        return gameController.listRollResults();
    }

    @RequestMapping(value = "/ranking", method = RequestMethod.GET)
    public String ranking()
    {
        return gameController.getSuccessRate();
    }
}