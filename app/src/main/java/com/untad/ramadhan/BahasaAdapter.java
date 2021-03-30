package com.untad.ramadhan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class BahasaAdapter extends ArrayAdapter<Bahasa> {
    private ArrayList<Bahasa> bahasaList;

    public BahasaAdapter(@NonNull Context context, int resource, ArrayList<Bahasa> bahasaList) {
        super(context, resource, bahasaList);
        this.bahasaList = bahasaList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        int phraseIndex = position;
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,
                    parent, false);
        }

        ImageView bookImage = convertView.findViewById(R.id.bahasa_imageview);
        TextView titleTextView = convertView.findViewById(R.id.nama_textview);
        TextView authorTextView = convertView.findViewById(R.id.deskripsi_textview);

        bookImage.setImageResource(bahasaList.get(position).getBahasaImageId());
        titleTextView.setText(bahasaList.get(position).getNama());
        authorTextView.setText(bahasaList.get(position).getDeskripsi());

        return convertView;
    }
}
