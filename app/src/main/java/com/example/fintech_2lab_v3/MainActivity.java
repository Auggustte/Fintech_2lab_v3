package com.example.fintech_2lab_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvResult;
    Spinner spOptionSelection;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvResult = findViewById(R.id.tvResult);
        this.spOptionSelection = findViewById(R.id.spOptionSelection);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource( this,
                R.array.counting_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        this.spOptionSelection.setAdapter(adapter);


    }

    public void onBtnCalculateClick(View view) {


    }
}