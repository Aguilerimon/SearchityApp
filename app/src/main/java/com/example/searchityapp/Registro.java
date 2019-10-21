package com.example.searchityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    private EditText et1, et2, et3, et4;
    private TextView tv1,tv2;
    private RadioButton rb1,rb2,rb3,rb4;

    private CheckBox check1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        et1= (EditText)findViewById(R.id.idNombre);
        et2= (EditText)findViewById(R.id.idApellido);
        et2= (EditText)findViewById(R.id.idEmail);
        et2= (EditText)findViewById(R.id.idConraseña);
        rb1= (RadioButton)findViewById(R.id.radioButton);
        rb2= (RadioButton)findViewById(R.id.radioButton2);
        rb3= (RadioButton)findViewById(R.id.radioButton);
        rb4= (RadioButton)findViewById(R.id.radioButton2);

        check1=(CheckBox)findViewById(R.id.checkBox);

        if (check1.isChecked()== true){
            Toast.makeText( this,  "Haz aceptado nuestros terminos de la aplicacion",Toast.LENGTH_SHORT).show();
        }



    }
}
