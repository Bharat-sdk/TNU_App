package com.makertech.tnustudentapp.uiTeacher.noticeTeacher;

import androidx.databinding.library.baseAdapters.BR;

import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.data.local.NoticeData;
import com.makertech.tnustudentapp.databinding.FragmentTeacherNoticeBinding;
import com.makertech.tnustudentapp.ui.base.BaseFragment;
import com.makertech.tnustudentapp.ui.notice.NoticeAdapter;

import java.util.ArrayList;
import java.util.List;

public class TeacherNoticeFragment extends BaseFragment<FragmentTeacherNoticeBinding,TeacherNoticeViewModel> {
    @Override
    protected void initView() {
        prepareNotice();
        NoticeAdapter noticeAdapter = new NoticeAdapter(prepareNotice());
        getViewBinding().noticeRecyclerView.setAdapter(noticeAdapter);
    }

    @Override
    protected Integer getBindingVariable() {
        return BR._all;
    }

    @Override
    protected TeacherNoticeViewModel initialViewModel() {
        return new TeacherNoticeViewModel();
    }

    @Override
    protected Integer getLayoutId() {
        return R.layout.fragment_teacher_notice;
    }

    List<NoticeData> prepareNotice() {
        List<NoticeData> noticeDataList = new ArrayList<>();
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
        return noticeDataList;
    }

}
