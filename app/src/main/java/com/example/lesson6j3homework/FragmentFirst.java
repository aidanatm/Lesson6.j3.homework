package com.example.lesson6j3homework;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FragmentFirst extends Fragment {

    RecyclerView recyclerView;
    Adapter1 adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        recyclerView = view.findViewById(R.id.rv1);
        adapter = new Adapter1();
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager manager =
                new LinearLayoutManager(requireContext(),
                        LinearLayoutManager.VERTICAL,
                        false);
        recyclerView.setLayoutManager(manager);


        ArrayList<ItemModel> list = new ArrayList<>();
        list.add(new ItemModel("Кудайбергенов Кайрат"));
        list.add(new ItemModel("Акылбекова Айбике"));
        list.add(new ItemModel("Эсенгулова Нуркыз"));
        list.add(new ItemModel("Чекиров Нуракбар"));
        list.add(new ItemModel("Азаматова Айгерим"));
        list.add(new ItemModel("Адилетов Атай"));
        list.add(new ItemModel("Курманбеков Дастан"));
        list.add(new ItemModel("Алиев Нурбек"));
        list.add(new ItemModel("Аргенов Нурбек"));
        list.add(new ItemModel("Алиев Азалия"));
        list.add(new ItemModel("Алиева Фатима"));
        list.add(new ItemModel("Султанова Нуржан"));
        list.add(new ItemModel("Алиев Нурбек"));

        adapter.addText(list);
        return view;
    }
}