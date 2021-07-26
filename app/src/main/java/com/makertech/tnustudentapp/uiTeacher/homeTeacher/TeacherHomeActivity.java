package com.makertech.tnustudentapp.uiTeacher.homeTeacher;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.databinding.library.baseAdapters.BR;
import androidx.fragment.app.Fragment;

import com.google.android.material.navigation.NavigationView;
import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.databinding.ActivityHomeBinding;
import com.makertech.tnustudentapp.ui.base.BaseActivity;
import com.makertech.tnustudentapp.ui.home.HomeViewModel;
import com.makertech.tnustudentapp.ui.notice.NoticeFragment;
import com.makertech.tnustudentapp.ui.work.WorkFragment;
import com.makertech.tnustudentapp.uiTeacher.noticeTeacher.TeacherNoticeFragment;
import com.makertech.tnustudentapp.uiTeacher.workTeacher.TeacherWorkFragment;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

import nl.joery.animatedbottombar.AnimatedBottomBar;

public class TeacherHomeActivity extends BaseActivity<ActivityHomeBinding,TeacherHomeViewModel> implements NavigationView.OnNavigationItemSelectedListener  {
    ActionBarDrawerToggle actionBarDrawerToggle;
    TextView name_of_teacher , teacher_uid;


    @Override
    protected void initView() {

        getSupportFragmentManager().beginTransaction().add(R.id.container_root,new TeacherNoticeFragment()).commit();
        setSupportActionBar(getViewBinding().toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        setActionBarDrawerToggle();
        getViewBinding().navigationviewMain.getMenu().clear();
        getViewBinding().navigationviewMain.inflateMenu(R.menu.menu_teacher_navigation_drawer);

        // Setting user details to navigation Header
        View header = getViewBinding().navigationviewMain.getHeaderView(0);
        name_of_teacher = header.findViewById(R.id.navigation_username);
        teacher_uid = header.findViewById(R.id.navigation_uid);



        getViewBinding().bottomNavigation.setOnTabSelectListener(new AnimatedBottomBar.OnTabSelectListener() {
            @Override
            public void onTabSelected(int lastIndex, AnimatedBottomBar.@Nullable Tab lastTab, int newIndex, AnimatedBottomBar.@NotNull Tab newTab) {
                Fragment fragment = null;
                switch (newTab.getId()) {
                    case R.id.tab_home: {

                        fragment = new TeacherNoticeFragment();

                    }
                    break;
                    case R.id.tab_work: {
                        fragment = new TeacherWorkFragment();

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
        return BR._all;
    }

    @Override
    protected TeacherHomeViewModel initialViewModel() {
        return new TeacherHomeViewModel();
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
