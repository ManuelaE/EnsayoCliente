package com.example.a1005705286.ensayocliente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Cliente cliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //NO OLVIDES EL FUCKING PERMISO DE INTERNET
        cliente = new Cliente();
        cliente.start();
    }
}
