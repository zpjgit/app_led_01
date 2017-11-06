package com.example.zpj.app_led_01;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    private boolean ledon = false;
    private Button button = null;
    private CheckBox checkBoxLed1 = null;
    private CheckBox checkBoxLed2 = null;
    private CheckBox checkBoxLed3 = null;
    private CheckBox checkBoxLed4 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        checkBoxLed1 = (CheckBox) findViewById(R.id.checkBox);
        checkBoxLed2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBoxLed3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBoxLed4 = (CheckBox) findViewById(R.id.checkBox4);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ledon = !ledon;
                if (ledon) {
                    button.setText("ALL OFF");
//                    checkBoxLed1.setChecked(true);
//                    checkBoxLed2.setChecked(true);
//                    checkBoxLed3.setChecked(true);
//                    checkBoxLed4.setChecked(true);

//                    for (int i=0; i < 4; i++) {
//                        HandCo
//                    }
                }
                else {
                    button.setText("ALL ON");
                }
            }
        });

    }
}
