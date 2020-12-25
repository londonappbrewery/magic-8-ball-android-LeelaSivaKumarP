package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Kick_me_button = (Button) findViewById(R.id.Kick_me_button_xml);
        final ImageView Ball_img = (ImageView) findViewById(R.id.Ball_img);

        final int[] Ball_img_arr = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        Kick_me_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("magic-8-ball-android-LeelaSivaKumarP","hi");
                Random random_no = new Random();
                int randomnu = random_no.nextInt(5);
                Ball_img.setImageResource(Ball_img_arr[randomnu]);
            }
        });
        

    }
}
