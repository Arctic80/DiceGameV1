package com.dicegame.Model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;


public class Player
{
    private final String name;
    private int wins = 0;
    private List<PlayResult> playResults = new ArrayList<>();

    public Player(String name)
    {
        this.name = name;
    }

    public void addPlayResult(PlayResult playResult)
    {
        if (playResult.isWin()) wins++;
        playResults.add(playResult);
    }

    public List<PlayResult> listPlayResults()

    {
        return playResults;
    }

    public String getSuccessRate()
    {
        double successRate = ((double) wins / (double) playResults.size()) * 100;
        BigDecimal bd = new BigDecimal(Double.toString(successRate)).setScale(2, RoundingMode.HALF_UP);

        return bd.toString().concat("%");
    }
}