package com.makertech.tnustudentapp.login;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.databinding.library.baseAdapters.BR;

import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.data.local.AppSharedPreferences;
import com.makertech.tnustudentapp.data.local.UserData;
import com.makertech.tnustudentapp.data.local.UserDataSource;
import com.makertech.tnustudentapp.databinding.LoginScreenBinding;
import com.makertech.tnustudentapp.ui.base.BaseActivity;
import com.makertech.tnustudentapp.ui.home.HomeActivity;
import com.makertech.tnustudentapp.uiTeacher.homeTeacher.TeacherHomeActivity;


public class LoginActivity extends BaseActivity<LoginScreenBinding,LoginBaseViewModel> {
    String _mail,_password,_role;
    boolean correct_credentials;
    @Override
    protected void initView() {
        AppSharedPreferences.getInstance(getApplicationContext());
        correct_credentials = false;
        UserDataSource.prepareUserData();

        if (AppSharedPreferences.isLogin())
        {
            redirectToTeacherOrStudent(AppSharedPreferences.getRole());
        }




getViewBinding().btnLogin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        _mail = getViewBinding().edtLoginEmailNumber.getText().toString();
        _password = getViewBinding().edtPassword.getText().toString();
        Log.d("TAG", "onClick: " + _mail + "   " + _password);
        for (UserData i : UserDataSource.userDataList)
        {
            if (_mail.equalsIgnoreCase(i.getUser_email()) && _password.equalsIgnoreCase(i.getUser_password()))
            {
                Log.d("TAG", "onClick: the get " + i.getUser_email() + "   " + i.getUser_password());
                correct_credentials = true;
                _role = i.getRole();
                break;
            }
        }
        AppSharedPreferences.getInstance(getApplicationContext());
        AppSharedPreferences.setIsLogin(true);
        AppSharedPreferences.setRole(_role);
        if (correct_credentials) {
            redirectToTeacherOrStudent(_role);
        }


    }
});


    }

    @Override
    protected Integer getBindingVariable() {
        return BR._all;
    }

    @Override
    protected LoginBaseViewModel initialViewModel() {
        return new LoginBaseViewModel();
    }

    @Override
    protected Integer getLayoutId() {
        return R.layout.login_screen;
    }

    void redirectToTeacherOrStudent(String roles)
    {
        if (roles.equals("Teacher"))
        {
            Intent intent = new Intent(getApplicationContext(), TeacherHomeActivity.class);
            startActivity(intent);
        }
        else if ( roles.equals("Student"))
        {
            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(intent);
        }
        finish();
    }
}
