package com.example.lesson6j3homework;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder1 extends RecyclerView.ViewHolder {

    TextView text;
    public ViewHolder1(@NonNull View itemView) {
        super(itemView);
        text =itemView.findViewById(R.id.textView);
    }
    public  void onBind(ItemModel data){
    text.setText(data.name);
    }
}
