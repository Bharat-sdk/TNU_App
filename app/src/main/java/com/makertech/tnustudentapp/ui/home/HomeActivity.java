package com.makertech.tnustudentapp.ui.home;

import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.fragment.app.Fragment;

import com.google.android.material.navigation.NavigationView;
import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.databinding.ActivityHomeBinding;
import com.makertech.tnustudentapp.ui.base.BaseActivity;
import com.makertech.tnustudentapp.ui.fragments.NoticeFragment;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import nl.joery.animatedbottombar.AnimatedBottomBar;

public class HomeActivity extends BaseActivity<ActivityHomeBinding,HomeViewModel> implements NavigationView.OnNavigationItemSelectedListener  {
    ActionBarDrawerToggle actionBarDrawerToggle;



    @Override
    protected void initView() {
        getSupportFragmentManager().beginTransaction().add(R.id.container_root,new NoticeFragment()).commit();
        setSupportActionBar(getViewBinding().toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setActionBarDrawerToggle();
        getViewBinding().bottomNavigation.setOnTabSelectListener(new AnimatedBottomBar.OnTabSelectListener() {
            @Override
            public void onTabSelected(int lastIndex, AnimatedBottomBar.@Nullable Tab lastTab, int newIndex, AnimatedBottomBar.@NotNull Tab newTab) {
                Fragment fragment = null;
                switch (newTab.getId()) {
                    case R.id.tab_home: {

                        fragment = new NoticeFragment();

                    }
                    break;
                    case R.id.tab_work: {
                        //    fragment = new AboutFragment();
                        Toast.makeText(getApplicationContext(),"work",Toast.LENGTH_SHORT).show();
                    }
                    break;
                    case R.id.tab_map: {
                        //   fragment = new MyOrderFragment();
                        Toast.makeText(getApplicationContext(),"Map",Toast.LENGTH_SHORT).show();
                    }
                    break;
                    case R.id.tab_about_us: {
                        //         fragment = new MyOrderFragment();
                        Toast.makeText(getApplicationContext(),"About College",Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                if (fragment != null)
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_root,fragment).commit();
                }
            }

            @Override
            public void onTabReselected(int i, AnimatedBottomBar.@NotNull Tab tab) {

            }
        });
        }

    private void setActionBarDrawerToggle() {
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,getViewBinding().drawerlayout,getViewBinding().toolbar,R.string.open_drawer,R.string.close_drawer);
        actionBarDrawerToggle.syncState();
        actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        getViewBinding().drawerlayout.addDrawerListener(actionBarDrawerToggle);
        getViewBinding().navigationviewMain.setNavigationItemSelectedListener(this);
    }

    @Override
    protected Integer getBindingVariable() {
        return 1;
    }

    @Override
    protected HomeViewModel initialViewModel() {
        return new HomeViewModel();
    }

    @Override
    protected Integer getLayoutId() {
        return R.layout.activity_home;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
        return false;
    }
}
