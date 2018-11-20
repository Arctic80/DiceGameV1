package com.dicegame.Model;

import java.util.concurrent.ThreadLocalRandom;


public class Dice
{
    private int rollValue;
    private ThreadLocalRandom random = ThreadLocalRandom.current();

    public Dice(){}

    public void rollDice()
    {
        rollValue = random.nextInt(1,7);
    }

    public int getRollValue()
    {
        return rollValue;
    }
}

