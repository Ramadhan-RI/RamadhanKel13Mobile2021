package com.untad.ramadhan;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Bahasa> bahasaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bahasaList = new ArrayList<>();

        //getting string arrays from resource
        Resources res = getResources();
        String[] allBahasa = res.getStringArray(R.array.bahasa);
        String[] allDeskripsi = res.getStringArray(R.array.deskripsi);

        pupoluateBookList(allBahasa, allDeskripsi);

        //setting adapter and listview
        BahasaAdapter adapter = new BahasaAdapter(getApplicationContext(),
                R.layout.list_item, bahasaList);
        ListView listview = findViewById(R.id.bahasa_list);
        listview.setAdapter(adapter);

    }

    public void pupoluateBookList(String[] books, String[] authors) {
        bahasaList.add(new Bahasa(books[0], authors[0], R.drawable.a));
        bahasaList.add(new Bahasa(books[1], authors[1], R.drawable.b));
        bahasaList.add(new Bahasa(books[2], authors[2], R.drawable.c));
        bahasaList.add(new Bahasa(books[3], authors[3], R.drawable.d));
        bahasaList.add(new Bahasa(books[4], authors[4], R.drawable.e));
        bahasaList.add(new Bahasa(books[5], authors[5], R.drawable.f));
        bahasaList.add(new Bahasa(books[6], authors[6], R.drawable.g));
        bahasaList.add(new Bahasa(books[7], authors[7], R.drawable.h));
        bahasaList.add(new Bahasa(books[8], authors[8], R.drawable.i));
        bahasaList.add(new Bahasa(books[9], authors[9], R.drawable.j));
    }

}