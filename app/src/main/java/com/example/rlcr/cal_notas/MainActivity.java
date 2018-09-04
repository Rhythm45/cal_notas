package com.example.rlcr.cal_notas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirPrincipal(View v){
        Intent principal = new Intent(getApplicationContext(), principal.class);
        startActivity(principal);
    }

    public void abrirDatos(View v){
        Intent datos = new Intent(getApplicationContext(), datos.class);
        startActivity(datos);
    }
}
