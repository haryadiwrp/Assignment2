package com.hacktiv8.assignment2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button count;
    private TextView textCount;
    private EditText inputText;
    private int angka = 0;
    Context context;

    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = findViewById(R.id.btnCount);
        textCount = findViewById(R.id.textCount);

        //textCount.setText("" + counter);

        count.setOnClickListener(this);

//        if (savedInstanceState != null) {
//            angka = savedInstanceState.getInt("key");
//            if (textCount != null) {
//                textCount.setText(String.valueOf(angka));
//            }
//        }
    }

    @Override
    public void onClick(View view) {
        angka++;
        textCount.setText(String.valueOf(angka));
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("hitung", angka);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        angka = savedInstanceState.getInt("hitung");
        textCount.setText(String.valueOf(angka));
    }
}