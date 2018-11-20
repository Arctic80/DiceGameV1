package com.dicegame;

import com.dicegame.Controller.GameController;
import com.dicegame.Model.PlayResult;
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
    public List<PlayResult> listResults()
    {
        return gameController.listPlayResults();
    }

    @RequestMapping(value = "/ranking", method = RequestMethod.GET)
    public String ranking()
    {
        return gameController.getSuccessRate();
    }
}