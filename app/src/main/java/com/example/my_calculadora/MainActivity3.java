package com.example.my_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private EditText primeroN;
    private EditText segundoN;
    private TextView resultadoOperacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        primeroN = findViewById(R.id.primer);
        segundoN = findViewById(R.id.segundo);

        resultadoOperacion = findViewById(R.id.resultado);
    }

    public void multiplicar(View view){
        double calculo = Double.parseDouble(primeroN.getText().toString())*Double.parseDouble(segundoN.getText().toString());
        resultadoOperacion.setText(calculo+"");
    }

    public void funcionParaBttnI (View view){
        Intent hola = new Intent(this, MainActivity.class);
        startActivity(hola);
    }

}