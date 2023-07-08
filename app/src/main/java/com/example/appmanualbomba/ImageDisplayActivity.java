package com.example.appmanualbomba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import com.github.chrisbanes.photoview.PhotoView;

public class ImageDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_display);

        // Obtén el identificador de la imagen seleccionada del Intent
        int selectedImage = getIntent().getIntExtra("selectedImage", 0);

        // Obtén la referencia al ImageView del nuevo layout
        PhotoView photoView1 = findViewById(R.id.photoView1);

        // Configura la imagen seleccionada en el ImageView
        photoView1.setImageResource(selectedImage);

    }
}