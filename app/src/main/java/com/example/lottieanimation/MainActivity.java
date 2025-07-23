package com.example.lottieanimation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.RenderMode; // Required for setRenderMode

public class MainActivity extends AppCompatActivity {

    LottieAnimationView laView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Initialize the view
        laView = findViewById(R.id.lottieAnimationView);



        // If using assets folder:
        laView.setAnimation("animationlop.json");

        // 3. Render mode & play
        laView.setRenderMode(RenderMode.SOFTWARE);
        laView.playAnimation();
    }
}
