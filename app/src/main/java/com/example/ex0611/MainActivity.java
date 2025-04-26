package com.example.ex0611;

import android.app.assist.AssistStructure;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
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
    private int selectedColor = Color.WHITE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swDN = findViewById(R.id.swDN);
        btn = findViewById(R.id.btn);
        rgColors = findViewById(R.id.rgColors);
        mainLayout = findViewById(R.id.mainLayout);


    }
    public void onSwitchChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked && selectedColor != Color.WHITE) {
            mainLayout.setBackgroundColor(selectedColor);
        }
    }

    public void onRadioGroupChanged(RadioGroup group, int checkedId) {
        if (checkedId == R.id.rbRed) {
            selectedColor = Color.RED;
        } else if (checkedId == R.id.rbGreen) {
            selectedColor = Color.GREEN;
        } else if (checkedId == R.id.rbBlue) {
            selectedColor = Color.BLUE;
        } else if (checkedId == R.id.rbYellow) {
            selectedColor = Color.YELLOW;
        }


        if (swDN.isChecked()) {
            mainLayout.setBackgroundColor(selectedColor);
        }
    }

    public void onRadioButtonClicked(View v) {

    }


    public void onApplyButtonClicked(View view) {
        if (!swDN.isChecked() && selectedColor != Color.WHITE) {
            mainLayout.setBackgroundColor(selectedColor);
        }
    }

}