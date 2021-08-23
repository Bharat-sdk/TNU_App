package com.makertech.tnustudentapp.ui.home;

import android.media.Image;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.fragment.app.Fragment;

import com.google.android.material.navigation.NavigationView;
import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.databinding.ActivityHomeBinding;
import com.makertech.tnustudentapp.ui.base.BaseActivity;
import com.makertech.tnustudentapp.ui.notice.NoticeFragment;
import com.makertech.tnustudentapp.ui.work.WorkFragment;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

import nl.joery.animatedbottombar.AnimatedBottomBar;

public class HomeActivity extends BaseActivity<ActivityHomeBinding,HomeViewModel> implements NavigationView.OnNavigationItemSelectedListener  {
    ActionBarDrawerToggle actionBarDrawerToggle;
    TextView name_of_student , student_uid;
Menu menu;




    @Override
    protected void initView() {

        getSupportFragmentManager().beginTransaction().add(R.id.container_root,new NoticeFragment()).commit();
        setSupportActionBar(getViewBinding().toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        setActionBarDrawerToggle();

        // Setting user details to navigation Header
        View header = getViewBinding().navigationviewMain.getHeaderView(0);
        name_of_student = header.findViewById(R.id.navigation_username);
        student_uid = header.findViewById(R.id.navigation_uid);
        menu = getViewBinding().navigationviewMain.getMenu();
        MenuItem item = menu.findItem(R.id.nav_menu_dept);





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
                       fragment = new WorkFragment();

                    }
                    break;
                    case R.id.tab_map: {
                        Toast.makeText(getApplicationContext(),"Map",Toast.LENGTH_SHORT).show();
                    }
                    break;
                    case R.id.tab_about_us: {
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
