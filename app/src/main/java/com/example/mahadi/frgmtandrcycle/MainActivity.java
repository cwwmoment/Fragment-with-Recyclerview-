package com.example.mahadi.frgmtandrcycle;

import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPageAdapter viewPageAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout_id);
        viewPager = (ViewPager) findViewById(R.id.pageViewId);

        viewPageAdapter = new ViewPageAdapter(getSupportFragmentManager());

   //     Add Fragment
        viewPageAdapter.AddFrmt(new Frmt_call(),"");
        viewPageAdapter.AddFrmt(new FrmtContact(),"");
        viewPageAdapter.AddFrmt(new Frmt_fav(),"");
        viewPageAdapter.AddFrmt(new Frmt_call(), "");
        viewPageAdapter.AddFrmt(new FrmtContact(), "");
        viewPageAdapter.AddFrmt(new Frmt_fav(), "");

        viewPager.setAdapter(viewPageAdapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_group_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_favorite_black_24dp);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_call_black_24dp);
        tabLayout.getTabAt(4).setIcon(R.drawable.ic_group_black_24dp);
        tabLayout.getTabAt(5).setIcon(R.drawable.ic_favorite_black_24dp);

        //Remove ActionBar Shadow

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);
    }
}
