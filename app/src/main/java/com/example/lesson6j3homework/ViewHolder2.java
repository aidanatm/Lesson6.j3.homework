package com.example.lesson6j3homework;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder2 extends RecyclerView.ViewHolder {

    TextView textView;
    public ViewHolder2(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.rvnums);

    }

    public void onBind(String data){
    textView.setText(data);
    }


}
