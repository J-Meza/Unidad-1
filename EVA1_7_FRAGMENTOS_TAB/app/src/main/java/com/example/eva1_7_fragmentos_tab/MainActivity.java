package com.example.eva1_7_fragmentos_tab;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
//import ;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tbLay = findViewById(R.id.tabs);
        Toolbar tbBar = findViewById(R.id.toolbar);
        setSupportActionBar(tbBar);
        ViewPager vwPag = findViewById(R.id.ViewPa);
        TabLayout tabs= findViewById(R.id.tabs);
        tabs.setupWithViewPager(vwPag);
        setupViewPager(vwPag);
    }

    private void setupViewPager(ViewPager vP){
        Adapter adFragAdap = new Adapter(getSupportFragmentManager());
        adFragAdap.addFragment(new TileFragment(),"Mosaicos");
        adFragAdap.addFragment(new ListFragment(),"Lista");
        adFragAdap.addFragment(new CardFragment(),"Card");
        vP.setAdapter(adFragAdap);

    }

    static class Adapter extends FragmentPagerAdapter{

        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mTitle = new ArrayList<>();


        public Adapter(FragmentManager manager) {
            super(manager);
        }



        @Override
        public Fragment getItem(int i) {

            return mFragmentList.get(i);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }


        public void addFragment(Fragment fragment, String title){
            mFragmentList.add(fragment);
            mTitle.add(title);


        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return mTitle.get(position);
        }
    }

}
