package com.example.alfonsogemaliel.alfonsogemaliel_1106132098_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DaftarMenu extends AppCompatActivity {
    RecyclerView rv;
    MenuAdapter adapter;
    List<PilihMenu> daftarmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        setTitle("Menu");

        daftarmenu = new ArrayList<>();
        rv = findViewById(R.id.listMenu);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        initdata();
    }
    private void initdata() {
        daftarmenu.add(new PilihMenu(R.drawable.nasiuduk, "Cheeseburger", 30000, "Nasi uduk dengan topping yang menggugah selera"));
        daftarmenu.add(new PilihMenu(R.drawable.ayamgoreng, "Ayam Goreng", 25000, "Ayam Goreng yang menggunakan bumbu rahasia"));
        daftarmenu.add(new PilihMenu(R.drawable.sateayam, "Sate Ayam", 30000, "Sate dengan menggunakan daging pilihan"));
        daftarmenu.add(new PilihMenu(R.drawable.nasi, "Spaghetti Bolognese", 6000, "Nasi putih dengan kualitas terbaik"));
        daftarmenu.add(new PilihMenu(R.drawable.tehpoci, "Spicy Wings", 10000, "Teh yang mempunyai rasa khas"));
        daftarmenu.add(new PilihMenu(R.drawable.coffee, "Spicy Wings", 10000, "Kopi hitam dengan aroma terbaik"));
        adapter = new MenuAdapter(this, daftarmenu);
        rv.setAdapter(adapter);
    }
}
