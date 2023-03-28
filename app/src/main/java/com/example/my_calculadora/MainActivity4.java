package com.example.my_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {


    /*private ArrayList <String> names;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        listview = findViewById(R.id.listview);

        names =  new ArrayList<>();

        names.add("kdjfs");
        names.add("kdjfs");
        names.add("kdjfsdslf");

        ArrayAdapter <String> adapter =  new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, names);
    }*/




    private EditText primerN;
    private TextView conteoN;
    //private ArrayList <String> names;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        primerN = findViewById(R.id.cantidad);
        conteoN = findViewById(R.id.result);
        //listview = findViewById(R.id.listview);

    }

    public static int fibonacci(int z){
        int f;
        int inicia = 0;
        int conteoN = 1;
        int secuencia;

        for (int i=1; i<=z; i++){
            secuencia = inicia;
            inicia = conteoN + inicia;
            conteoN = secuencia;
            System.out.println(conteoN);
        }
        return conteoN;
    }
    public void resSecuencia (View view){
        int r = fibonacci(Integer.parseInt(primerN.getText().toString()));
        conteoN.setText(Integer.toString(r) + "");
    }


    public void funcionParaBttnI (View view){
        Intent hola = new Intent(this, MainActivity.class);
        startActivity(hola);
    }
}