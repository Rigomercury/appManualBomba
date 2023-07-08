package com.example.appmanualbomba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ImagenDoble extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen_doble);

        // Obtén las referencias a los ImageView del nuevo layout
        ImageView imageView1 = findViewById(R.id.imageView1);
        ImageView imageView2 = findViewById(R.id.imageView2);

        // Carga las imágenes en los ImageView
        imageView1.setImageResource(R.drawable.page_9);
        imageView2.setImageResource(R.drawable.page_11);

    }
}