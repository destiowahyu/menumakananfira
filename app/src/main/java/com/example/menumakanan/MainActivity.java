package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rec_Makanan;
    private ArrayList<Kuliner> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rec_Makanan = findViewById(R.id.rec_Makanan);
        initData();

        rec_Makanan.setAdapter(new KulinerAdapter(listMakanan));
        rec_Makanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Kuliner("Nasi Goreng",
                "Rp. 10.000",
                "Nasi goreng enak di nikmatin bersama keluarga",
                R.drawable.nasigoreng));
        listMakanan.add(new Kuliner("Mie Ayam",
                "Rp. 12.000",
                "Mie dengan toping ayam sangat segar dan enak",
                R.drawable.mieayam));
        listMakanan.add(new Kuliner("Bubur Ayam",
                "Rp. 10.000",
                "Bubur ayam full toping bisa pilih toping sesuka hati",
                R.drawable.bubur));
        listMakanan.add(new Kuliner("Capcay",
                "Rp. 7.000",
                "Sayur segar serta fresh untuk pendorong nasi",
                R.drawable.capcay));
        listMakanan.add(new Kuliner("Papeda",
                "Rp. 2.000",
                "tekstur yang kenyalll, bikin ketagihan looooo",
                R.drawable.pappeda));
        listMakanan.add(new Kuliner("Soto Sapi",
                "Rp. 10.000",
                "Soto dengan suwiran ayam dan telur bacem.",
                R.drawable.sotosapi));
        listMakanan.add(new Kuliner("Seblak",
                "Rp. 15.000",
                "Seblak dengan toping kerupuk telur dan ayam",
                R.drawable.seblak));
        listMakanan.add(new Kuliner("Tahu Gimbal",
                "Rp. 15.000",
                "Makanan Kesukaan Elfira",
                R.drawable.tahugimbal));
    }
}