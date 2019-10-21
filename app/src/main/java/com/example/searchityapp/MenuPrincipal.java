package com.example.searchityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void preregistro(View view) {
        Intent preregistro = new Intent(this, ActividadPreregistro.class);
        startActivity(preregistro);
    }

    public void irperfil(View view) {
        Intent irperfil = new Intent(this, Perfil.class);
        startActivity(irperfil);
    }
}
