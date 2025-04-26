package com.example.ex0611;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Switch swDN;
    Button btn;
    RadioGroup rgColors;
    RadioButton rbRed, rbGreen, rbBlue, rbYellow;
    LinearLayout mainLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swDN = findViewById(R.id.swDN);
        btn = findViewById(R.id.btn);
        rgColors = findViewById(R.id.rgColors);
        mainLayout = findViewById(R.id.mainLayout);

        RadioButton rbRed = new RadioButton(this);
        rbRed.setText("Red");
        rbRed.setId(View.generateViewId());
        rgColors.addView(rbRed);

        RadioButton rbGreen = new RadioButton(this);
        rbGreen.setText("Green");
        rbGreen.setId(View.generateViewId());
        rgColors.addView(rbGreen);

        RadioButton rbBlue = new RadioButton(this);
        rbBlue.setText("Blue");
        rbBlue.setId(View.generateViewId());
        rgColors.addView(rbBlue);

        RadioButton rbYellow = new RadioButton(this);
        rbYellow.setText("Yellow");
        rbYellow.setId(View.generateViewId());
        rgColors.addView(rbYellow);

    }

    private void applyBackgroundColor() {
        if (swDN.isChecked()) {
            if (rbRed.isChecked()) {
                mainLayout.setBackgroundColor(Color.RED);
            } else if (rbGreen.isChecked()) {
                mainLayout.setBackgroundColor(Color.GREEN);
            } else if (rbBlue.isChecked()) {
                mainLayout.setBackgroundColor(Color.BLUE);
            } else if (rbYellow.isChecked()) {
                mainLayout.setBackgroundColor(Color.YELLOW);
            }
        } else {
            if (rbRed.isChecked()) {
                mainLayout.setBackgroundColor(Color.RED);
            } else if (rbGreen.isChecked()) {
                mainLayout.setBackgroundColor(Color.GREEN);
            } else if (rbBlue.isChecked()) {
                mainLayout.setBackgroundColor(Color.BLUE);
            } else if (rbYellow.isChecked()) {
                mainLayout.setBackgroundColor(Color.YELLOW);
            }
        }
    }
}