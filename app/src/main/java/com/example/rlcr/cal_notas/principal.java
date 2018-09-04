package com.example.rlcr.cal_notas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void abrirDatos(View v){
        Intent datos = new Intent(getApplicationContext(), datos.class);
        startActivity(datos);
    }

    public void abrirCalculadora(View v){
        Intent calculadora = new Intent(getApplicationContext(), calculadora.class);
        startActivity(calculadora);
    }
}
