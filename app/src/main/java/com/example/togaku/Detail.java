package com.example.togaku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;


public class Detail extends AppCompatActivity {
    public static final String name ="Name";
    public static final String isi ="Isi";
    public static final String img = "Img";
    TextView dtNama;
    TextView dtIsi;
    ImageView dtImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        dtNama = findViewById(R.id.detail_nama);
        String getNama = getIntent().getStringExtra(name);
        dtNama.setText(getNama);

        dtImg = findViewById(R.id.detail_img);
        int getImg = getIntent().getIntExtra(img,0);
        Glide.with(this)
                .load(getImg)
                .apply(new RequestOptions().override(400,400))
                .into(dtImg);

        dtIsi = findViewById(R.id.detail_isi);
        String getIsi= getIntent().getStringExtra(isi);
        dtIsi.setText(getIsi);

    }

}
