package com.dicegame;

public class DiceRollResult
{
    private final int rollValue;
    private final boolean win;


    public DiceRollResult(int dice1Value, int dice2Value)
    {
        this.rollValue = dice1Value + dice2Value;

        if (rollValue == 7) win = true;
        else win = false;
    }

    public int getRollValue()
    {
        return rollValue;
    }

    public boolean isWin()
    {
        return win;
    }
}