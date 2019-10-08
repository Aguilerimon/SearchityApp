package com.example.searchityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActividadPreregistro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_preregistro);
    }

    //Metodo hacia preregistro
    public void preregistro(View view) {
        Intent preregistro = new Intent(this, ActividadLogin.class);
        startActivity(preregistro);
    }
}
