package com.example.oscar.homersipson_oscargonzalez;

import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private AnimationDrawable anim;
    private ImageView engraVermell, engraVerd,engraBlau,ull,donut;
    private Animation animation2, animation1,animation4, animation5;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animation();
        mp = MediaPlayer.create(this, R.raw.the_simpsons);
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
            derecha(engraVerd);
            izquierda(engraBlau);
            izquierda(engraVermell);
            mueveDonut(donut);

            mueveOjo();
        }else{

            engraVermell.clearAnimation();
            engraBlau.clearAnimation();
            engraVerd.clearAnimation();
            ull.clearAnimation();
            donut.clearAnimation();


            engraVermell.setVisibility(View.INVISIBLE);
            engraVerd.setVisibility(View.INVISIBLE);
            engraBlau.setVisibility(View.INVISIBLE);
            ull.setVisibility(View.INVISIBLE);
            donut.setVisibility(View.INVISIBLE);
        }
    }
    private void derecha(ImageView engra){
        animation2 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwisederecha);

        engra.startAnimation(animation2);

    }
    private void izquierda(ImageView engra){
        animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwiseizquierda);

        engra.startAnimation(animation1);
    }
    private void mueveDonut(ImageView donut){

        animation4 =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        donut.startAnimation(animation4);
    }


    private void mueveOjo(){
        animation5 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.ull);
        ull.startAnimation(animation5);
    }

    public void clickDonut(View view){
        if(mp.isPlaying()){
            mp.stop();
        }else{
            mp.start();
        }
    }
}

