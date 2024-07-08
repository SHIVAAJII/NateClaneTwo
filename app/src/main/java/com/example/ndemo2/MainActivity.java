package com.example.ndemo2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {




    String[] names={"Pramod One","Pramod Two","Pramod Three","Pramod Four","Pramod Five","Pramod One","Pramod Two","Pramod Three","Pramod Four","Pramod Five","Pramod One","Pramod Two","Pramod Three","Pramod Four","Pramod Five","Pramod One","Pramod Two","Pramod Three","Pramod Four","Pramod Five"};
    int[] images={R.drawable.pk,R.drawable.pk1,R.drawable.pk2,R.drawable.pk3,R.drawable.pk4,R.drawable.pk,R.drawable.pk1,R.drawable.pk2,R.drawable.pk3,R.drawable.pk4,R.drawable.pk,R.drawable.pk1,R.drawable.pk2,R.drawable.pk3,R.drawable.pk4,R.drawable.pk,R.drawable.pk1,R.drawable.pk2,R.drawable.pk3,R.drawable.pk4};





    TabLayout tabLayout;
    ViewPager2 viewPager;
    AdapterForViewPager adapter;
    BottomNavigationView bottomNavigationView;
    FrameLayout frameLayout;

    LinearLayout refine;





    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    ActionBarDrawerToggle toggle;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutId, new PersonalTabFragment()).commit();







        refine=(LinearLayout) findViewById(R.id.refine_layoutId);





        toolbar=(androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbarId);
        setSupportActionBar(toolbar);

        drawerLayout=(DrawerLayout) findViewById(R.id.drawerLId);
        navigationView=(NavigationView) findViewById(R.id.navViewId);


        toggle=new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


//        Objects.requireNonNull(getActionBar()).setDisplayHomeAsUpEnabled(true);
//        //getActionBar().setHomeButtonEnabled(true);














        tabLayout=(TabLayout) findViewById(R.id.tabLayoutId);
        viewPager=(ViewPager2) findViewById(R.id.viewPagerId);
        adapter=new AdapterForViewPager(this);
        viewPager.setAdapter(adapter);
        bottomNavigationView=(BottomNavigationView) findViewById(R.id.bottomNevId);
        frameLayout=(FrameLayout) findViewById(R.id.frameLayoutId);






        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setVisibility(View.VISIBLE);
                frameLayout.setVisibility(View.GONE);
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

                viewPager.setVisibility(View.VISIBLE);
                frameLayout.setVisibility(View.GONE);

            }
        });





        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {


                switch (position)
                {
                    case 0:
                    case 1:
                    case 2:
                        tabLayout.getTabAt(position).select();

                }


                super.onPageSelected(position);
            }
        });













        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                frameLayout.setVisibility(View.VISIBLE);
                viewPager.setVisibility(View.GONE);


                int itemId=item.getItemId();
                if(itemId==R.id.exploreId)
                {
                    tabLayout.setVisibility(View.VISIBLE);
                    viewPager.setVisibility(View.VISIBLE);
                    frameLayout.setVisibility(View.GONE);
                    //getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutId, new ExploreBottomFragment()).commit();
                    return true;
                }
                else if(itemId==R.id.connectionsId)
                {
                    tabLayout.setVisibility(View.GONE);
                    viewPager.setVisibility(View.GONE);
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutId, new ConnectionsBottomFragment()).commit();
                    return true;
                }
                else if(itemId==R.id.chatId)
                {
                    tabLayout.setVisibility(View.GONE);
                    viewPager.setVisibility(View.GONE);
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutId, new ChatBottomFragment()).commit();
                    return true;
                }
                else if(itemId==R.id.contactsId)
                {
                    tabLayout.setVisibility(View.GONE);
                    viewPager.setVisibility(View.GONE);
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutId, new ContactsBottomFragment()).commit();
                    return true;
                }
                else if(itemId==R.id.groupsId)
                {
                    tabLayout.setVisibility(View.GONE);
                    viewPager.setVisibility(View.GONE);
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutId, new GroupsBottomFragment()).commit();
                    return true;
                }

                return true;
            }
        });











        refine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                startActivity(new Intent(getApplicationContext(), RefineScreen.class));



            }
        });











//
//        personal_recyclerView=(RecyclerView) findViewById(R.id.personal_recyclerViewId);
//        services_recyclerView=(RecyclerView) findViewById(R.id.services_recyclerViewId);
//        businesses_recyclerView=(RecyclerView) findViewById(R.id.businesses_recyclerViewId);




//        ClassForAdapter per_myAdapter=new ClassForAdapter(images,names);
//        ClassForAdapter se_myAdapter=new ClassForAdapter(images,names);
//        ClassForAdapter busi_myAdapter=new ClassForAdapter(images,names);



//============(For LinearLayoutManager)=======================================================

//        personal_recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        personal_recyclerView.setAdapter(per_myAdapter);

//        services_recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        services_recyclerView.setAdapter(se_myAdapter);
//
//        businesses_recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        businesses_recyclerView.setAdapter(busi_myAdapter);


//        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
//        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
//        recyclerView.setLayoutManager(linearLayoutManager);
//        recyclerView.setAdapter(myAdapter);




//        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
//
//        recyclerView.setLayoutManager(linearLayoutManager);
//        recyclerView.setAdapter(myAdapter);




//==================(GridViewLayoutManager)

//        GridLayoutManager layoutManager=new GridLayoutManager(this,2);
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(myAdapter);



//        GridLayoutManager layoutManager=new GridLayoutManager(this,2);
//        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(myAdapter);




//=====================for default size of images (SteggeredGridLayoutManager)  ==========================

//
//        StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(2,LinearLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(myAdapter);





    }


}