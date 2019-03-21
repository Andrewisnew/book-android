package com.book.andrewisnew.simpleanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void animate(View view) {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.newcombo);
        findViewById(R.id.text).startAnimation(anim);
    }
}
