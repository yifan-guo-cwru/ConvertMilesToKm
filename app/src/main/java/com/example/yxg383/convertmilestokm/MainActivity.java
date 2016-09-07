package com.example.yxg383.convertmilestokm;

import android.annotation.TargetApi;
import android.icu.text.DecimalFormat;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonConvMilesToKm = (Button)findViewById(R.id.buttonConvMilesToKm);
        buttonConvMilesToKm.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                EditText textBoxMiles = (EditText) findViewById(R.id.editTextConvMilesToKm);
                EditText textBoxKm = (EditText) findViewById(R.id.editTextConvKmToMiles);
                double vMiles = Double.valueOf(textBoxMiles.getText().toString());
                double vKm = vMiles / 0.62137;
                DecimalFormat formstVal = new DecimalFormat("##.##");
                textBoxKm.setText(formstVal.format(vKm));
            }
        });

        Button buttonConvKmToMiles = (Button)findViewById(R.id.buttonConvKmToMiles);
        buttonConvKmToMiles.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                EditText textBoxMiles = (EditText) findViewById(R.id.editTextConvMilesToKm);
                EditText textBoxKm = (EditText) findViewById(R.id.editTextConvKmToMiles);
                double vKm = Double.valueOf(textBoxKm.getText().toString());
                double vMiles = vKm * 0.62137;
                DecimalFormat formstVal = new DecimalFormat("##.##");
                textBoxMiles.setText(formstVal.format(vMiles));
            }
        });
    }
}
