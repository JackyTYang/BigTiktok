package com.bytedance.minitiktok.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.bytedance.minitiktok.Constants;
import com.bytedance.minitiktok.R;


public class MainActivity2 extends AppCompatActivity {
    private static final int REQUEST_CODE = 1025;
    private TextView btn_first_page;
    private TextView btn_friend;
    private TextView btn_message;
    private TextView btn_me;
    private ImageView btn_post_video;

    private int nowFragment = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        bindButtonListener();
    }

    private void bindButtonListener() {
        btn_first_page = (TextView) findViewById(R.id.first_page);
        btn_friend = (TextView) findViewById(R.id.friend);
        btn_post_video = (ImageView) findViewById(R.id.post_video);
        btn_message = (TextView) findViewById(R.id.message);
        btn_me = (TextView) findViewById(R.id.me);

        btn_first_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btn_friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, FriendActivity.class);
                startActivity(intent);
            }
        });
        btn_post_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, VideoActivity.class);
                startActivity(intent);
            }
        });
        btn_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MessageActivity.class);
                startActivity(intent);
            }
        });
        btn_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MeActivity.class);
                startActivity(intent);
            }
        });
    }

    private void updateFragment(Fragment fragment, int fragmentIndex) {
        if (nowFragment == fragmentIndex) {
            return;
        }
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_id, fragment)
                .commit();
        if (nowFragment >= 0) {
            switch (fragmentIndex) {
                case Constants.home_id:
                    btn_first_page.setTextColor(getResources().getColor(R.color.color_simple_text));
                case Constants.samecity_id:
                    btn_friend.setTextColor(getResources().getColor(R.color.color_simple_text));
                case Constants.message_id:
                    btn_message.setTextColor(getResources().getColor(R.color.color_simple_text));
                case Constants.me_id:
                    btn_me.setTextColor(getResources().getColor(R.color.color_simple_text));
            }
        }
        switch (fragmentIndex) {
            case Constants.home_id:
                btn_first_page.setTextColor(getResources().getColor(R.color.white));
            case Constants.samecity_id:
                btn_friend.setTextColor(getResources().getColor(R.color.white));
            case Constants.message_id:
                btn_message.setTextColor(getResources().getColor(R.color.white));
            case Constants.me_id:
                btn_me.setTextColor(getResources().getColor(R.color.white));
        }
        nowFragment = fragmentIndex;
    }
}