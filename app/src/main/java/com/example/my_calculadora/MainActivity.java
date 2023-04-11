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
    private EditText numero;

    private TextView resultadoOperacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miBoton = findViewById(R.id.button);
        numero = findViewById(R.id.editTextNumber);

    }

    public void funcionParaBttnI(View view) {
        Intent hola = new Intent(this, MainActivity.class);
        startActivity(hola);

    }

   public void funcionParaBttn5(View view) {
        Intent hola5 = new Intent(this, MainActivity5.class);
        startActivity(hola5);

    }

    public void funcionParaBoton(View view) {
        Intent hola2 = new Intent(this, MainActivity2.class);
        Intent hola3 = new Intent(this, MainActivity3.class);
        Intent hola4 = new Intent(this, MainActivity4.class);

        if (Integer.parseInt(numero.getText().toString()) == 1) {
            startActivity(hola2);
        } else if (Integer.parseInt(numero.getText().toString()) == 2) {
            startActivity(hola3);
        } else if (Integer.parseInt(numero.getText().toString()) == 3) {
            startActivity(hola4);

        }
    }
}