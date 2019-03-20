package com.example.oscar.homersipson_oscargonzalez;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private AnimationDrawable anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animation();
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
}

