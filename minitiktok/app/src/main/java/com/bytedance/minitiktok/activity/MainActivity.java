package com.bytedance.minitiktok.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bytedance.minitiktok.R;
import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

public class MainActivity extends AppCompatActivity {

    ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView init_gif = (ImageView) findViewById(R.id.welcome);
        int resourceId = R.mipmap.desktop;
        Glide.with(this)
                .load(resourceId)
                .transition(withCrossFade())
                .into(init_gif);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        }, 2000);
    }
}