package com.bytedance.minitiktok.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bytedance.minitiktok.R;

public class LoginActivity extends AppCompatActivity {

    private String default_account = "ZJUWLAN";
    private String default_password = "123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView btn = findViewById(R.id.btn_login);
        EditText edit_user_account = findViewById(R.id.edit_user_account);
        EditText edit_user_password = findViewById(R.id.edit_user_password);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit_user_account.getText().toString().equals(default_account)){
                    if(edit_user_password.getText().toString().equals(default_password)){
                        Intent intent = new Intent(LoginActivity.this, MainActivity2.class);
                        LoginActivity.this.startActivity(intent);
                    }
                    else{
                        Toast toast = Toast.makeText(LoginActivity.this, "密码不正确，请重试",
                                Toast.LENGTH_SHORT);
                        toast.show();
                    }

                }
                else{
                    Toast toast = Toast.makeText(LoginActivity.this, "该用户未注册，请重试",
                            Toast.LENGTH_SHORT);
                    toast.show();

                }
            }

        });
    }
}
