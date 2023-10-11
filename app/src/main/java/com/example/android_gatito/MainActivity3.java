package com.example.android_gatito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        regresar = findViewById(R.id.regresar);
        regresar.setOnClickListener(this);
        Intent intent = getIntent();
        int contadorX = intent.getIntExtra("contadorX", 0);
        int contadorO = intent.getIntExtra("contadorO", 0);

        TextView textViewX = findViewById(R.id.textViewX);
        TextView textViewO = findViewById(R.id.textViewO);

        // Asigna los valores de los contadores a los TextView
        textViewX.setText("Victorias de X: " + contadorX);
        textViewO.setText("Victorias de O: " + contadorO);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.regresar) {
            Intent i = new Intent(this, MainActivity2.class);
            startActivity(i);
        }
    }
}