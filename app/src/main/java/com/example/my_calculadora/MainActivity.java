package com.example.my_calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button miBoton;
    private EditText usuario;

    private TextView contrasena;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miBoton = findViewById(R.id.button9);
        usuario = findViewById(R.id.US);
        contrasena = findViewById(R.id.PW);

    }

    public void funcionParaBttnI(View view) {
        Intent hola = new Intent(this, MainActivity.class);
        startActivity(hola);

    }
   public void funcionParaBttn5(View view) {
        Intent hola5 = new Intent(this, MainActivity5.class);
        startActivity(hola5);

    }

}