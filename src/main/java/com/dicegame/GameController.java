package com.dicegame;

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
        DiceRollResult diceRollResult = new DiceRollResult(dice1.getRollValue(), dice2.getRollValue());
        player.addRollResult(diceRollResult);

        System.out.println(diceRollResult.getRollValue());

        String result;
        if (diceRollResult.isWin()) result = "You Win!";
        else result = "You Lose!";

        return result;
    }

    public List<DiceRollResult> listRollResults()
    {
        return player.listRollResults();
    }

    public String getSuccessRate()
    {
        return "Succes rate is: " + player.getSuccessRate();
    }
}