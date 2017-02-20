package com.example.subeksha.shopar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.example.subeksha.shopar.mFragments.BagFragment;
import com.example.subeksha.shopar.mFragments.HomeFragment;
import com.example.subeksha.shopar.mFragments.CategoriesFragment;
import com.example.subeksha.shopar.mFragments.NotificationFragment;
import com.example.subeksha.shopar.mFragments.ProfileFragment;;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, AHBottomNavigation.OnTabSelectedListener{

    AHBottomNavigation bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        //setSupportActionBar(toolbar);

        bottomNavigation = (AHBottomNavigation) findViewById(R.id.myBottomNav);
        bottomNavigation.setOnTabSelectedListener(this);
        this.createNavItems();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    private void createNavItems(){
        //Create items
        AHBottomNavigationItem homeItem=new AHBottomNavigationItem("Home",R.drawable.home);
        AHBottomNavigationItem categoriesItem=new AHBottomNavigationItem("Categories",R.drawable.list);
        AHBottomNavigationItem profileItem=new AHBottomNavigationItem("Profile",R.drawable.profile);
        AHBottomNavigationItem notificationItem=new AHBottomNavigationItem("Notification",R.drawable.not);
        AHBottomNavigationItem bagItem=new AHBottomNavigationItem("Bag",R.drawable.bag);

        // Add them to the bar

        bottomNavigation.addItem(homeItem);
        bottomNavigation.addItem(categoriesItem);
        bottomNavigation.addItem(profileItem);
        bottomNavigation.addItem(notificationItem);
        bottomNavigation.addItem(bagItem);



        //Set Properties
        bottomNavigation.setDefaultBackgroundColor(Color.parseColor("#FFE4E1"));

        //Set Current Item
        bottomNavigation.setCurrentItem(0);
    }

    @Override
    public void onTabSelected(int position, boolean wasSelected) {
        //Show Fragments
        if (position==0)
        {
            HomeFragment homeFragment=new HomeFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_id,homeFragment).commit();
        }else if (position==1)
        {
            CategoriesFragment categoriesFragement=new CategoriesFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_id,categoriesFragement).commit();
        }else if (position==2)
        {
            ProfileFragment profileFragment=new ProfileFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_id,profileFragment).commit();
        }else if (position==3)
        {
            NotificationFragment notificationFragment=new NotificationFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_id,notificationFragment).commit();
        }else if (position==4)
        {
            BagFragment bagFragment=new BagFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_id,bagFragment).commit();
        }


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }





    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
