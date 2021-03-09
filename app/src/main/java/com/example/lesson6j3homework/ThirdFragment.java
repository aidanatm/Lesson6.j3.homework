package com.example.lesson6j3homework;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ThirdFragment extends Fragment {

    ImageView image;
    TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_third, container, false);
//        image = view.findViewById(R.id.caed);
//        text = view.findViewById(R.id.collisey);

        return  view;
    }
}