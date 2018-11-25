package com.example.kalex.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
Button botonBuscar , botonIngresar, botonGuardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonBuscar = (Button)findViewById(R.id.btnbuscar);
        botonIngresar = (Button)findViewById(R.id.btnguardar);
        botonGuardar = (Button)findViewById(R.id.btningresar);


        botonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, buscar.class);
                startActivity(intent);
            }
        });

        botonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ingresar.class);
                startActivity(intent);
            }
        });

        botonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, guardar.class);
                startActivity(intent);
            }
        });
    }
}
