package com.example.lesson6j3homework;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecondFragment extends Fragment {

    RecyclerView recyclerView;
    Adapter2 adapter2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        recyclerView = view.findViewById(R.id.rv2);
        adapter2 = new Adapter2();
        recyclerView.setAdapter(adapter2);
        RecyclerView.LayoutManager manager =
                new LinearLayoutManager(requireContext(),
                                LinearLayoutManager.VERTICAL,
                                            false);
        recyclerView.setLayoutManager(manager);



        return  view;
    }
}