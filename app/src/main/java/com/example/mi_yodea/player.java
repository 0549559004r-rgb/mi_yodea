package com.example.mi_yodea;

import android.util.Log;

public class player
{
   String name;
   int lives;
   int magicpower;

   public player (int lives, String name, int mp)
   {
       this.lives = lives;
       this.name = name;
       this.magicpower = mp;
   }
   public void displayinfo()
   {
       System.out.println(name);
       System.out.println(lives);
   }
   public void attack() {
       Log.d("this", "the character attacks");
   }
    public abstract void heal();


}
