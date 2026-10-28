package com.example.mi_yodea;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "this";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.d(TAG, "one");
        fighter f1 = new fighter(6, "nehorai");
        magician m1 = new magician(7, "harel", 7);
        fighter f2 = new fighter(8, "daniel");
        magician m2 = new magician(2, "maxsim", 9);

        f1.displayinfo();
        m1.displayinfo();
        f2.displayinfo();
        m2.displayinfo();

        m1.castspell();

        Log.d(TAG, "two");
        f1.attack();
        m1.attack();
        f2.attack();
        m2.attack();

        Log.d(TAG, "three");
        player o1 = new fighter(4, "yosi1");
        player o2 = new magician(5, "yosi2",5);
        player o3 = new fighter(6, "yosi3");

        o1.heal();
        o2.heal();
        o3.heal();


        Log.d(TAG, "four");
        player[] players = {new fighter(8, "yuval"), new magician(3, "hannah", 2), new magician(10, "sophia",8)};

        for (player player : players) {
            player.displayinfo();
            player.attack();
            player.heal();

        }
        Log.d(TAG, "five");
        {

        }

    }
}