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
        listMakanan.add(new Kuliner("Bakso",
                "Rp. 10.000",
                "Bakso murah porsi banyak, segar untuk di makan saat hujan",
                R.drawable.bakso));
        listMakanan.add(new Kuliner("Bubur Ayam",
                "Rp. 10.000",
                "Bubur ayam full toping bisa pilih toping sesuka hati",
                R.drawable.bubur));
        listMakanan.add(new Kuliner("Lalapan",
                "Rp. 7.000",
                "Sayur segar serta fresh untuk pendorong nasi",
                R.drawable.lalapan));
        listMakanan.add(new Kuliner("Mie Ayam",
                "Rp. 12.000",
                "Mie dengan toping ayam sangat segar dan enak",
                R.drawable.mieayam));
        listMakanan.add(new Kuliner("Sate",
                "Rp. 20.000",
                "Sate ayam atau kambing dengan bumbu kecap atau bumbu kacang.",
                R.drawable.sate));
        listMakanan.add(new Kuliner("Soto Ayam",
                "Rp. 15.000",
                "Soto dengan suwiran ayam dan telur bacem.",
                R.drawable.soto));
        listMakanan.add(new Kuliner("Seblak",
                "Rp. 15.000",
                "Seblak dengan toping kerupuk telur dan ayam",
                R.drawable.seblak));
        listMakanan.add(new Kuliner("Nasi Padang",
                "Rp. 20.000",
                "Makanan yg paling enak di makan menggunakan tangan",
                R.drawable.nasipadang));
    }
}