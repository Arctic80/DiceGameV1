package com.dicegame.Model;


public class PlayResult
{
    private final int playValue;
    private final boolean win;


    public PlayResult(int dice1Value, int dice2Value)
    {
        this.playValue = dice1Value + dice2Value;

        if (playValue == 7) win = true;
        else win = false;
    }

    public int getPlayValue() {
        return playValue;
    }

    public boolean isWin() {
        return win;
    }
}