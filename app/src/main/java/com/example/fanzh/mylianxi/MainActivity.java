package com.example.fanzh.mylianxi;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn_view);
        findViewById(R.id.move).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trance();
            }
        });
        findViewById(R.id.rotation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trance();
                rotation();
            }
        });
        findViewById(R.id.alpha).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trance();
                rotation();
                alpha();
            }
        });
        findViewById(R.id.jianbian).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                argb();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "我是button", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.tiaodao).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, GaodeActivity.class));
            }
        });
    }

    private void trance() {
//        ValueAnimator animator = ValueAnimator.ofFloat(0, 200, 0, 500, 0);
//        animator.setDuration(3000);
//        animator.start();
//        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                btn.setTranslationX((Float) animation.getAnimatedValue());
//
//            }
//        });
        ObjectAnimator animator = ObjectAnimator.ofFloat(btn, "translationX", 0, 500);
        animator.setDuration(3000);
        animator.start();
    }


    public void rotation() {
//        ValueAnimator animator = ValueAnimator.ofFloat(0, 200, 0, 500, 0);
//        animator.setDuration(3000);
//        animator.start();
//        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                btn.setRotation((Float) animation.getAnimatedValue());
//
//            }
//        });
        ObjectAnimator animator = ObjectAnimator.ofFloat(btn, "rotationY", 0, 360, 0);
        animator.setDuration(3000);
        animator.start();
    }

    public void alpha() {
//        ValueAnimator animator = ValueAnimator.ofFloat(0, 1);
//        animator.setDuration(3000);
//        animator.start();
//        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                btn.setAlpha((Float) animation.getAnimatedValue());
//
//            }
//        });
        ObjectAnimator animator = ObjectAnimator.ofFloat(btn, "alpha", 0, 1, 0);
        animator.setDuration(3000);
        animator.setRepeatCount(10);
        animator.start();
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void argb() {
//        ValueAnimator animator = ValueAnimator.ofFloat(0, 100);
//        animator.setDuration(3000);
//        animator.start();
//        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                btn.setScaleX(animation.getAnimatedFraction());
//            }
//        });
        ObjectAnimator animator = ObjectAnimator.ofArgb(btn, "backgroundColor", 0xffff00ff, 0xffffff00, 0xffff00ff);
        animator.setDuration(3000);
        animator.start();
    }
}
