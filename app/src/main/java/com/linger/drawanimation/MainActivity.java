package com.linger.drawanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private AnimationDrawable animationDrawable;//播放帧动画的对象
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView= (ImageView) findViewById(R.id.iv_draw);
        animationDrawable= (AnimationDrawable) imageView.getDrawable();
    }

    @Override
    protected void onResume() {
        super.onResume();
        animationDrawable.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        animationDrawable.stop();
    }
}
