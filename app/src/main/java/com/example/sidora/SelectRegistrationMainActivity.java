package com.example.sidora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SelectRegistrationMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_registration_main);

        Button donorButton = findViewById(R.id.donorButton);
        Button recipientButton = findViewById(R.id.recipientButton);
        TextView backButton = findViewById(R.id.backButton);


        donorButton.setOnClickListener(view -> {
        });

        recipientButton.setOnClickListener(view -> {
        });

        backButton.setOnClickListener(view -> {
            Intent intent = new Intent(
                    SelectRegistrationMainActivity.this, LoginActivity.class);
            startActivity(intent);
        });

    }
}