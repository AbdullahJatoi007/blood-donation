package com.example.blooddonation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.airbnb.lottie.L;
import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.google.firebase.Firebase;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class dashbrd extends AppCompatActivity {

    MeowBottomNavigation bottomNavigation;
    RelativeLayout home,user,precaution,setting;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashbrd);

        bottomNavigation = findViewById(R.id.bottomnavigation);

        home = findViewById(R.id.home);
        user = findViewById(R.id.user);
        precaution = findViewById(R.id.precation);
        setting = findViewById(R.id.setting);

        home.setVisibility(View.VISIBLE);
        user.setVisibility(View.GONE);
        precaution.setVisibility(View.GONE);
        setting.setVisibility(View.GONE);

        bottomNavigation.show(1, true);

        bottomNavigation.add(new MeowBottomNavigation.Model(1 ,R.drawable.home));
        bottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.user));
        bottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.caution));
        bottomNavigation.add(new MeowBottomNavigation.Model(4, R.drawable.settings));

        Meownavigation();


    }

    private void Meownavigation() {
        bottomNavigation.setOnClickMenuListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {

                switch (model.getId()){
                    case 1 :
                        home.setVisibility(View.VISIBLE);
                        user.setVisibility(View.GONE);
                        precaution.setVisibility(View.GONE);
                        setting.setVisibility(View.GONE);
                        break;

                }
                switch (model.getId()){
                    case 2 :
                        home.setVisibility(View.GONE);
                        user.setVisibility(View.VISIBLE);
                        precaution.setVisibility(View.GONE);
                        setting.setVisibility(View.GONE);
                        break;

                }
                switch (model.getId()){
                    case 3 :
                        home.setVisibility(View.GONE);
                        user.setVisibility(View.GONE);
                        precaution.setVisibility(View.VISIBLE);
                        setting.setVisibility(View.GONE);
                        break;

                }
                switch (model.getId()){
                    case 4 :
                        home.setVisibility(View.GONE);
                        user.setVisibility(View.GONE);
                        precaution.setVisibility(View.GONE);
                        setting.setVisibility(View.VISIBLE);
                        break;

                }
                return null;
            }
        });
    }
}