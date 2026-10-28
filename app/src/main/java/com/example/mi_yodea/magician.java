package com.example.mi_yodea;

import android.util.Log;

import com.example.mi_yodea.player;

public class magician extends player {
    public magician(int lives, String name, int mp)
    {
        super(lives, name, mp);
    }
    @Override
    public void attack()
    {
        Log.d("this", name + " attacks with magic");
    }
    public String getType()
    {
        return "magician";
    }
    @Override
    public void heal() {
        Log.d("this", name + " heals himself with magic");
    }
    public void castspell() {
        Log.d("this", name + " has casted a powerful spell");
    }

}