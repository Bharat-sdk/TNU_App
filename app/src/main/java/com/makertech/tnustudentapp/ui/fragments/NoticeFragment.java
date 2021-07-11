package com.makertech.tnustudentapp.ui.fragments;

import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.databinding.FragmentStudentNoticeBinding;
import com.makertech.tnustudentapp.ui.base.BaseFragment;
import com.makertech.tnustudentapp.ui.base.BaseViewModel;

public class NoticeFragment extends BaseFragment {

    @Override
    protected void initView() {

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
}
