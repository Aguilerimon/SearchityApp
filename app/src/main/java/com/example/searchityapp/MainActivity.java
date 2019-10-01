package com.example.searchityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo hacia preregistro
    public void preregistro(View view) {
        Intent preregistro = new Intent(this, ActividadPreregistro.class);
        startActivity(preregistro);
    }
}
