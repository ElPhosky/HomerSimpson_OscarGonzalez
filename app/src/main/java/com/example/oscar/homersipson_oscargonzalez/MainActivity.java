package com.example.oscar.homersipson_oscargonzalez;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private AnimationDrawable anim;
    private ImageView engraVermell, engraVerd,engraBlau,ull,donut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animation();
        engraVermell = findViewById(R.id.imageEngraVermell);
        engraVerd = findViewById(R.id.imageEngraVerd);
        engraBlau = findViewById(R.id.imageEngraBlau);
        ull = findViewById(R.id.ImageUll);
        donut = findViewById(R.id.imageDonut);
    }

    private void animation() {
        ImageView img = (ImageView)findViewById(R.id.simple_anim);
        anim = (AnimationDrawable)img.getDrawable();
        img.post(run);
    }
    Runnable run = new Runnable() {
        @Override
        public void run() {
            anim.start();
        }
    };
    public void onClick(View view){
        if(engraVermell.getVisibility()==View.INVISIBLE){
            engraVermell.setVisibility(View.VISIBLE);
            engraVerd.setVisibility(View.VISIBLE);
            engraBlau.setVisibility(View.VISIBLE);
            ull.setVisibility(View.VISIBLE);
            donut.setVisibility(View.VISIBLE);
        }else{
            engraVermell.setVisibility(View.INVISIBLE);
            engraVerd.setVisibility(View.INVISIBLE);
            engraBlau.setVisibility(View.INVISIBLE);
            ull.setVisibility(View.INVISIBLE);
            donut.setVisibility(View.INVISIBLE);
        }
    }
}

