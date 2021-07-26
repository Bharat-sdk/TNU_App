package com.makertech.tnustudentapp.data.local;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserDataSource {
    public static List<UserData> userDataList = new ArrayList<>();

    public static void prepareUserData()
    {
        UserData userData = new UserData("P N Bharat Kumar","TNU2018020100004","Student",7,"password12","bharatkumar@gmail.com");
        userDataList.add(userData);
        userData = new UserData("Raj Zamal","TNU2018020100001","Student",7,"password12","rajzamal@gmail.com");
        userDataList.add(userData);
        userData = new UserData("Pranam Paul","TNU2018020100024","Teacher",7,"password12","pranampaul@gmail.com");
        userDataList.add(userData);
        userData = new UserData("Bilas Haldar","TNU2018020100054","Teacher",7,"password12","bilashaldar@gmail.com");
        userDataList.add(userData);
    }
}
