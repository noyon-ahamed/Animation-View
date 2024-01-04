package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageview;
    Button btnanim;

    Animation fade_in;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnanim=findViewById(R.id.btnanim);
        imageview=findViewById(R.id.imageview);

        fade_in=AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade_in);


        btnanim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imageview.startAnimation(fade_in);

            }
        });



    }
}