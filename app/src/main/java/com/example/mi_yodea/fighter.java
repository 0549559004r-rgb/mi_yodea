package com.example.mi_yodea;

import android.util.Log;

import com.example.mi_yodea.player;

public class fighter extends player {
    public fighter(int lives, String name)
    {
        super(lives, name);
    }
    @Override
    public void attack()
    {
        Log.d("this", name + " attacks with a sword");
    }
    public String getType()
    {
        return "fighter";
    }
    @Override
    public void heal() {
        Log.d("this", name + " heals himself with bandages");
    }


}