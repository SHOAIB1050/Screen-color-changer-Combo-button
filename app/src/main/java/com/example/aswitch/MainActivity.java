package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    public Switch SS1;
    public Switch SS2;
    public Switch SS3;
    ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SS1=findViewById(R.id.s1);
        SS2=findViewById(R.id.s2);
        SS3=findViewById(R.id.s3);
        layout=findViewById(R.id.r1);

        SS1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(SS1.isChecked()){
                    layout.setBackgroundColor(Color.YELLOW);
                }
                else{
                    layout.setBackgroundColor(Color.GREEN);
                }


            }
        });
        SS2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(SS2.isChecked()){
                    layout.setBackgroundColor(Color.WHITE);
                }
                else {
                    layout.setBackgroundColor(Color.MAGENTA);
                }
            }
        });
        SS3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(SS3.isChecked()){
                    layout.setBackgroundColor(Color.CYAN);
                }
                else {
                    layout.setBackgroundColor(Color.LTGRAY);
                }
            }
        });

    }
}