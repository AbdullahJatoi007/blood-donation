package com.example.blooddonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class signup extends AppCompatActivity {

    TextView already_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        already_account = findViewById(R.id.alreadyaccount);
        already_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent already_account = new Intent(signup.this , MainActivity.class);
                startActivity(already_account);
                finish();
            }
        });

    }
}