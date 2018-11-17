package com.dicegame;

import java.util.concurrent.ThreadLocalRandom;


public class Dice
{
    private int rollValue;
    private ThreadLocalRandom randomizer = ThreadLocalRandom.current();

    public Dice(){}

    public void rollDice()
    {
        rollValue = randomizer.nextInt(1,8);
    }

    public int getRollValue()
    {
        return rollValue;
    }
}

