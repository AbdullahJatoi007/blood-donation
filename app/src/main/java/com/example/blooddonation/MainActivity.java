package com.example.blooddonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usermail ,usercode;
    TextView create_account;

    Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        create_account = findViewById(R.id.createaccount);
        usermail = findViewById(R.id.user_mail);
        usercode = findViewById(R.id.usr_password);
        loginbtn = findViewById(R.id.btn_login);

        loginbtn.setOnClickListener(new View.OnClickListener() {




            @Override
            public void onClick(View v) {
                String username =usermail.getText().toString();
                String user_code = usercode.getText().toString();


                if (username.isEmpty()){
                    usermail.requestFocus();
                    usermail.setError("plz enter mail");

                } else if (user_code.isEmpty()) {
                    usercode.requestFocus();
                    usercode.setError("plz enter code");
                }
                else if (username.equalsIgnoreCase("abdullah") && user_code.equalsIgnoreCase("jatoi")) {
                    ;
                    Toast.makeText(MainActivity.this, "login successful", Toast.LENGTH_SHORT).show();

                    Intent dashbrd = new Intent(MainActivity.this, dashbrd.class);
                    startActivity(dashbrd);
                    finish();
                }else{
                    Toast.makeText(MainActivity.this, "login failed", Toast.LENGTH_SHORT).show();
                }

            }

        });



        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent create_account = new Intent(MainActivity.this  , signup.class);
                startActivity(create_account);
                finish();

            }
        });
    }
}