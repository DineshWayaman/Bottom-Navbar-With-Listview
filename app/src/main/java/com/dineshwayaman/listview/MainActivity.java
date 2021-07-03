
/*
Created by Dinesh Wayaman
Date : 2021/07/03
*/

package com.dineshwayaman.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.dineshwayaman.listview.Fragment.HomeFragment;
import com.dineshwayaman.listview.Fragment.SecondFragmant;
import com.dineshwayaman.listview.Fragment.ThirdFragment;

public class MainActivity extends AppCompatActivity implements AHBottomNavigation.OnTabSelectedListener{

    AHBottomNavigation bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = (AHBottomNavigation) findViewById(R.id.bottomNav);
        bottomNavigation.setOnTabSelectedListener(this);
        this.createNavItem();

        
        
    }

    private void createNavItem() {
        AHBottomNavigationItem firstItem = new AHBottomNavigationItem("First", R.drawable.ic_baseline_home_24);
        AHBottomNavigationItem secondItem = new AHBottomNavigationItem("First", R.drawable.ic_baseline_home_24);
        AHBottomNavigationItem thirdItem = new AHBottomNavigationItem("First", R.drawable.ic_baseline_home_24);


        bottomNavigation.addItem(firstItem);
        bottomNavigation.addItem(secondItem);
        bottomNavigation.addItem(thirdItem);

        bottomNavigation.setDefaultBackgroundColor(Color.parseColor("#FEFEFE"));

        bottomNavigation.setCurrentItem(0);


    }

    @Override
    public boolean onTabSelected(int position, boolean wasSelected) {
        if(position==0){
            HomeFragment firstFregment = new HomeFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_id,firstFregment).commit();
        }else if(position==1){
            SecondFragmant secondFragmant = new SecondFragmant();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_id,secondFragmant).commit();
        }else if(position==2){
            ThirdFragment thirdFragmant = new ThirdFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_id,thirdFragmant).commit();
        }
        return true;
    }
}