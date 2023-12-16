package com.example.blooddonation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.Firebase;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class signup extends AppCompatActivity {

    FirebaseAuth signup;
    String[] groups = {"A+","A-","B+","B-","AB+","AB-","O+","O-"};
    AutoCompleteTextView autoCompleteTextView;
    Button btnsignup ;
    TextInputEditText   email ,mypassword;
    ArrayAdapter<String> adaptergroups;
    TextView already_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        already_account = findViewById(R.id.alreadyaccount);
        autoCompleteTextView = findViewById(R.id.auto_complete_text);
        btnsignup = findViewById(R.id.signup);
        email =findViewById(R.id.mail);
        mypassword= findViewById(R.id.password);
        signup = FirebaseAuth.getInstance();
        adaptergroups = new ArrayAdapter<String>(this, R.layout.blood_groups,groups);

        autoCompleteTextView.setAdapter(adaptergroups);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String  groups = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(signup.this, "Added"+groups  , Toast.LENGTH_SHORT).show();
            }
        });

//            btnsignup.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    signup.createUserWithEmailAndPassword(email , mypassword)
//                            .addOnCompleteListener( new OnCompleteListener<AuthResult>() {
//                                @Override
//                                public void onComplete(@NonNull Task<AuthResult> task) {
//                                    if (task.isSuccessful()) {
//
//                                    } else {
//                                        // If sign in fails, display a message to the user.
//
//                                        Toast.makeText(signup.this, "Authentication failed.",
//                                                Toast.LENGTH_SHORT).show();
//
//                                    }
//                                }
//                            });
//                }
//            });
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