package com.example.togaku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class about extends AppCompatActivity {
    private ImageView foto;
    private TextView nama, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        foto = (ImageView) findViewById(R.id.about_foto);
        nama = findViewById(R.id.about_nama);
        email = findViewById(R.id.about_email);
    }
}
