package com.makertech.tnustudentapp.data.local;

import android.content.Context;
import android.content.SharedPreferences;

public class AppSharedPreferences {
    private static AppSharedPreferences appSharedPreferences;
    private static SharedPreferences sharedPreferences;
    public static String KEY_IS_LOGIN="IS_LOGIN";
    public static String ROLE= "ROLE";

private AppSharedPreferences(Context context)
{
    sharedPreferences =  context.getSharedPreferences("TNUAPPSHAREDPREFERENCE",Context.MODE_PRIVATE);
}

    public static AppSharedPreferences getInstance(Context context)
    {
        if(appSharedPreferences==null)
        {
            appSharedPreferences= new AppSharedPreferences(context);
        }
        return appSharedPreferences;
    }

    public static void setIsLogin(boolean value)
    {
        sharedPreferences.edit().putBoolean(KEY_IS_LOGIN,value).commit();

    }
    public static boolean isLogin()
    {
        return sharedPreferences.getBoolean(KEY_IS_LOGIN,false);
    }

    public static void setRole(String role)
    {
        sharedPreferences.edit().putString(ROLE,role).commit();
    }

    public static String getRole()
    {
       return sharedPreferences.getString(ROLE,"None");

    }


}
