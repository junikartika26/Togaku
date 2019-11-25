package com.example.togaku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.togaku.adapter.ListTogaAdapter;
import com.example.togaku.model.Toga;
import com.example.togaku.model.TogaData;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    private ImageView img;
    private TextView nama;
    private RecyclerView rvToga;
    private ArrayList <Toga> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        img = findViewById(R.id.img_item_photo);
        nama = findViewById(R.id.tv_item_name);
        rvToga = findViewById(R.id.rv_toga);
        rvToga.setHasFixedSize(true);

        list.addAll(TogaData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvToga.setLayoutManager(new LinearLayoutManager(this));
        ListTogaAdapter listTogaAdapter = new ListTogaAdapter(list);
        rvToga.setAdapter(listTogaAdapter);

        listTogaAdapter.setOnItemClickCallback(new ListTogaAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Toga data) {
                Intent detail = new Intent (Home.this, Detail.class);
                detail.putExtra(String.valueOf(Detail.name), data.getName());
                detail.putExtra(String.valueOf(Detail.isi), data.getDetail());
                detail.putExtra(String.valueOf(Detail.img), data.getPhoto());
                startActivity(detail);
                //showSelectedHero(data);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.about) {
            Intent intent=new Intent(Home.this,about.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    /*private void showSelectedHero(Toga toga) {
        Toast.makeText(this, "Kamu memilih " + toga.getName(), Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(Home.this,Detail.class);
        startActivity(intent);
    }*/

}
