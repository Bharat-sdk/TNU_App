package com.makertech.tnustudentapp.data.local;

import com.makertech.tnustudentapp.R;

import java.util.ArrayList;
import java.util.List;

public class NoticeDataSource {
    public static List<NoticeData> noticeDataList = new ArrayList<>();

    static void prepareNotice() {
        NoticeData notice = new NoticeData("Pranam Paul",R.id.tnu_name_login_screen, R.drawable.ic_icon_awesome_user_alt);
        noticeDataList.add(notice);
        notice = new NoticeData("Pooja Thakral",R.id.tnu_name_login_screen, R.drawable.ic_icon_awesome_user_alt);
        noticeDataList.add(notice);
        notice = new NoticeData("Bharat Kumar",R.id.tnu_name_login_screen, R.drawable.ic_icon_awesome_user_alt);
        noticeDataList.add(notice);
        notice = new NoticeData("Karman Singh",R.id.tnu_name_login_screen, R.drawable.ic_icon_awesome_user_alt);
        noticeDataList.add(notice);
        notice = new NoticeData("Raj Zamal",R.id.tnu_name_login_screen, R.drawable.ic_icon_awesome_user_alt);
        noticeDataList.add(notice);
    }
}

