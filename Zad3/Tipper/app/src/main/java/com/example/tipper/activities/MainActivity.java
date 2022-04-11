package com.example.tipper.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tipper.R;
import com.example.tipper.cannonGame.CannonActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private Button bmiButton;
    private Button kcalButton;
    private Button recipesButton;
    private Button cannonButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // call superclass onCreate
        setContentView(R.layout.activity_main); // inflate the GUI

        bmiButton = (Button) findViewById(R.id.bmiButton);
        kcalButton = (Button) findViewById(R.id.kcalButton);
        recipesButton = (Button) findViewById(R.id.recipesButton);
        cannonButton = (Button) findViewById(R.id.cannonButton);

        bmiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity(BmiActivity.class);
            }
        });

        kcalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity(KcalActivity.class);
            }
        });

        recipesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity(RecipeActivity.class);
            }
        });

        cannonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity(CannonActivity.class);
            }
        });

    }

    private void launchActivity(Class activity){
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }
}
