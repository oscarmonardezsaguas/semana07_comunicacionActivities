package com.example.semana07_comunicacionactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView1;
    TextView textView2;
    TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView1 = findViewById(R.id.nombre);
        textView2 = findViewById(R.id.rut);
        textView3 = findViewById(R.id.edad);
|
        Intent intent = getIntent();

        String nombre = intent.getExtras().getString("nombre");
        textView1.setText(nombre);

        String rut = intent.getExtras().getString("rut");
        textView2.setText(rut);

        int edad = intent.getExtras().getInt("edad");
        textView3.setText(Integer.toString(edad));
    }
}