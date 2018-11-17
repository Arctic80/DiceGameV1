package com.dicegame;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;


public class Player
{
    private final String name;
    private int wins = 0;
    private List<DiceRollResult> diceRollResults = new ArrayList<>();

    public Player(String name)
    {
        this.name = name;
    }

    public void addRollResult(DiceRollResult diceRollResult)
    {
        if (diceRollResult.isWin()) wins++;
        diceRollResults.add(diceRollResult);
    }

    public List<DiceRollResult> listRollResults()
    {
        return diceRollResults;
    }

    public String getSuccessRate()
    {
        double successRate = ((double) wins / (double) diceRollResults.size()) * 100;
        BigDecimal bd = new BigDecimal(Double.toString(successRate)).setScale(2, RoundingMode.HALF_UP);;

        return bd.toString().concat("%");
    }
}