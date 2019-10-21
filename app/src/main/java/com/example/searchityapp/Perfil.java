package com.example.searchityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

public class Perfil extends AppCompatActivity
{
private Spinner spinner1;
private ListView lv1;
private EditText et1,et2,et3,et4;

private String nombres []= {"TICS","Mecanica","Electrica","Quimica","Industrial","Admin","Gestion Empresarial","Materiales"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        spinner1= (Spinner) findViewById(R.id.spinner);

        String [] opciones ={"editar cuenta","borrar cuenta","opciones de cuenta"};
        ArrayAdapter <String>adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);

        lv1= (ListView)findViewById(R.id.lv1);
        ArrayAdapter <String>adapter2 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, nombres);
        lv1.setAdapter(adapter2);

    }
}
