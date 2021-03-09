package com.example.lesson6j3homework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    Adapter1 adapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.vp);
        adapter1 = new Adapter1();
        setUpViewPager(viewPager);

        tabLayout.setupWithViewPager(viewPager);



    }


    private void  setUpViewPager(ViewPager viewPager){
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentFirst(), "Tittles");
        adapter.addFragment(new SecondFragment(),"Numbers" );
        adapter.addFragment(new ThirdFragment(), "Images");
        viewPager.setAdapter(adapter);
    }
}