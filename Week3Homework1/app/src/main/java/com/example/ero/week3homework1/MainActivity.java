package com.example.ero.week3homework1;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewPager viewPager = findViewById(R.id.viewPager);
        final ViewPagerAdapter adapter = new ViewPagerAdapter(this, getList());
        viewPager.setAdapter(adapter);

        final TabLayout tabLayout = findViewById(R.id.tab_Layout);
        tabLayout.setupWithViewPager(viewPager, true);
    }

    public List<Girl> getList() {
        final List<Girl> list = new ArrayList<>();
        list.add(new Girl("Qiso", R.drawable.beauti));
        list.add(new Girl("Qiso", R.drawable.cherylcole));
        list.add(new Girl("ELIZABETH OSLEN", R.drawable.elizabetholsen));
        list.add(new Girl("Qiso", R.drawable.scree595));
        return list;


    }
}
