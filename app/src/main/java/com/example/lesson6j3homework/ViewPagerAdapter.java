package com.example.lesson6j3homework;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private  final List<Fragment> fragmentList = new ArrayList<>();
    private  final List<String> fragmentTittleList = new ArrayList<>();



    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTittleList.get(position);
    }


    public  void addFragment(Fragment fragment, String tittle){
        fragmentList.add(fragment);
        fragmentTittleList.add(tittle);
    }
}
