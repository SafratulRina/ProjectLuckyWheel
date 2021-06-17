package com.example.projekluckywheel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class WheelActivity extends AppCompatActivity {
    ImageView wheelimg;

    String[] sectors = {"01", "02", "03", "04","05", "06", "07", "08", "09","10", "11", "12", "13", "14", "15"};

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wheel);
        wheelimg = findViewById(R.id.wheel);
        textView = findViewById(R.id.txtv);

        Collections.reverse(Arrays.asList(sectors));

    }
    public void spinWheel(View view){

        Random rr = new Random();
        final int degree = rr.nextInt(360);

        RotateAnimation rotateAnimation = new RotateAnimation(
                0,degree + 720,     // 720 to take two rotation
                RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                RotateAnimation.RELATIVE_TO_SELF, 0.5f);

        rotateAnimation.setDuration(3000);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setInterpolator(new DecelerateInterpolator());

        rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}

            @Override
            public void onAnimationEnd(Animation animation) {
                CalculatePoint(degree);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        wheelimg.startAnimation(rotateAnimation);
    }
    public void CalculatePoint(int degree){
        // total degree 360 || 15 segment || 30 degree each segment

        int initialPoint = 0;
        int endPoint = 30;
        int i = 0;
        String res = null;
        do{
            if (degree > initialPoint && degree < endPoint){
                res = sectors[i];
            }
            initialPoint += 30; endPoint += 30;
            i++;
        }while(res == null);

        textView.setText(res);
    }
}