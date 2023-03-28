package com.example.my_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private EditText base;
    private EditText potencia;
    private TextView resultadoOperacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        base = findViewById(R.id.txtx);
        potencia = findViewById(R.id.txtz);

        resultadoOperacion = findViewById(R.id.res);
    }


    public static int Potencia( int x, int z ){
        int resultado =1;
        for (int i=1; i<=z; i++){
            resultado = resultado * x;
        }
        return resultado;
    }

    public void resPotencia (View view){
        int r = Potencia(Integer.parseInt(base.getText().toString()),Integer.parseInt(potencia.getText().toString()));
        resultadoOperacion.setText(Integer.toString(r) + "");
    }

    public void funcionParaBttnI (View view){
        Intent hola = new Intent(this, MainActivity.class);
        startActivity(hola);
    }

}