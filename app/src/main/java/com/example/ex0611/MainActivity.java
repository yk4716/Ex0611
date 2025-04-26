package com.example.ex0611;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Switch swDN;
    Button btn;
    RadioGroup rgColors;
    RadioButton rbRed;
    RadioButton rbGreen;
    RadioButton rbBlue;
    RadioButton rbYellow;
    LinearLayout TL;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swDN = findViewById(R.id.swDN);
        btn = findViewById(R.id.btn);
        rgColors = findViewById(R.id.rgColors);
        rbRed = findViewById(R.id.rbRed);
        rbGreen = findViewById(R.id.rbGreen);
        rbBlue = findViewById(R.id.rbBlue);
        rbYellow = findViewById(R.id.rbYellow);
        TL = findViewById(R.id.TL);

    }

    public void goSwitch (View view) {

        if (!swDN.isChecked()) {
            if (rbRed.isChecked()) TL.setBackgroundColor(Color.RED);
            if (rbGreen.isChecked()) TL.setBackgroundColor(Color.GREEN);
            if (rbBlue.isChecked()) TL.setBackgroundColor(Color.BLUE);
            if (rbYellow.isChecked()) TL.setBackgroundColor(Color.YELLOW);
        }
    }
    public void change(View view) {
        if (swDN.isChecked()) {
            if (rbRed.isChecked()) TL.setBackgroundColor(Color.RED);
            if (rbGreen.isChecked()) TL.setBackgroundColor(Color.GREEN);
            if (rbBlue.isChecked()) TL.setBackgroundColor(Color.BLUE);
            if (rbYellow.isChecked()) TL.setBackgroundColor(Color.YELLOW);
        }
    }
}