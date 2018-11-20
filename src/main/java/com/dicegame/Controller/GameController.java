package com.dicegame.Controller;

import com.dicegame.Model.Dice;
import com.dicegame.Model.PlayResult;
import com.dicegame.Model.Player;

import java.util.List;


public class GameController
{
    Player player;

    public GameController(){}

    public void createPlayer(String name)
    {
        player = new Player(name);
    }

    public String play()
    {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        dice1.rollDice();
        dice2.rollDice();

        PlayResult playResult = new PlayResult(dice1.getRollValue(), dice2.getRollValue());
        player.addPlayResult(playResult);

        System.out.println(playResult.getPlayValue());

        String result;
        if (playResult.isWin()) result = "You Win!";
        else result = "You Lose!";

        return result;
    }

    public List<PlayResult> listPlayResults()
    {
        return player.listPlayResults();
    }

    public String getSuccessRate()
    {
        return "Succes rate is: " + player.getSuccessRate();
    }
}