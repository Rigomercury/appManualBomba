package com.example.appmanualbomba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCables,btnBoton,btnTeclados,btnSimon,btnPrimero,btnMemoria,btnMorse,
            btnComplicados,btnSequencia,btnLaberintos,btnContraseñas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCables = findViewById(R.id.btnCables);
        btnBoton = findViewById(R.id.btnBoton);
        btnTeclados = findViewById(R.id.btnTeclados);
        btnSimon = findViewById(R.id.btnSimon);
        btnPrimero = findViewById(R.id.btnPrimero);
        btnMemoria = findViewById(R.id.btnMemoria);
        btnMorse = findViewById(R.id.btnMorse);
        btnComplicados = findViewById(R.id.btnComplicados);
        btnSequencia = findViewById(R.id.btnSequencia);
        btnLaberintos = findViewById(R.id.btnLaberintos);
        btnContraseñas = findViewById(R.id.btnContraseñas);

        btnCables.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ImageDisplayActivity.class);
            intent.putExtra("selectedImage", R.drawable.page_5);
            startActivity(intent);
        });
        btnBoton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ImageDisplayActivity.class);
            intent.putExtra("selectedImage", R.drawable.page_6);
            startActivity(intent);
        });
        btnTeclados.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ImageDisplayActivity.class);
            intent.putExtra("selectedImage", R.drawable.page_7);
            startActivity(intent);
        });
        btnSimon.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ImageDisplayActivity.class);
            intent.putExtra("selectedImage", R.drawable.page_8);
            startActivity(intent);
        });
        /*SE DEBEN ABRIR 2 IMAGENES*/
        btnPrimero.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ImagenDoble.class);
            startActivity(intent);
        });
        btnMemoria.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ImageDisplayActivity.class);
            intent.putExtra("selectedImage", R.drawable.page_11);
            startActivity(intent);
        });
        btnMorse.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ImageDisplayActivity.class);
            intent.putExtra("selectedImage", R.drawable.page_12);
            startActivity(intent);
        });
        btnComplicados.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ImageDisplayActivity.class);
            intent.putExtra("selectedImage", R.drawable.page_13);
            startActivity(intent);
        });
        btnSequencia.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ImageDisplayActivity.class);
            intent.putExtra("selectedImage", R.drawable.page_14);
            startActivity(intent);
        });
        btnLaberintos.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ImageDisplayActivity.class);
            intent.putExtra("selectedImage", R.drawable.page_15);
            startActivity(intent);
        });
        btnContraseñas.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ImageDisplayActivity.class);
            intent.putExtra("selectedImage", R.drawable.page_16);
            startActivity(intent);
        });
    }
}