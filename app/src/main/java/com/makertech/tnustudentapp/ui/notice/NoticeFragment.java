package com.makertech.tnustudentapp.ui.notice;

import androidx.databinding.DataBindingUtil;

import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.data.local.NoticeData;
import com.makertech.tnustudentapp.data.local.NoticeDataSource;
import com.makertech.tnustudentapp.databinding.FragmentStudentNoticeBinding;
import com.makertech.tnustudentapp.ui.base.BaseFragment;
import com.makertech.tnustudentapp.ui.base.BaseViewModel;

import java.util.ArrayList;
import java.util.List;

public class NoticeFragment extends BaseFragment {
FragmentStudentNoticeBinding binding;
    public List<NoticeData> noticeDataList = new ArrayList<>();

    @Override
    protected void initView() {
        prepareNotice();
        NoticeAdapter noticeAdapter = new NoticeAdapter(noticeDataList);
        binding = DataBindingUtil.setContentView(getActivity(),R.layout.fragment_student_notice);
        binding.setAdapter(noticeAdapter);
    }

    @Override
    protected Integer getBindingVariable() {
        return 2;
    }

    @Override
    protected BaseViewModel initialViewModel() {
        return null;
    }

    @Override
    protected Integer getLayoutId() {
        return R.layout.fragment_student_notice;
    }

    void prepareNotice() {
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
