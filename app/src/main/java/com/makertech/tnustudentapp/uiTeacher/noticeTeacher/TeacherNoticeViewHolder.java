package com.makertech.tnustudentapp.uiTeacher.noticeTeacher;

import com.makertech.tnustudentapp.data.local.NoticeData;
import com.makertech.tnustudentapp.databinding.ItemNoticeBinding;
import com.makertech.tnustudentapp.ui.base.BaseViewHolder;

public class TeacherNoticeViewHolder extends BaseViewHolder<NoticeData,ItemNoticeBinding> {
    public TeacherNoticeViewHolder(ItemNoticeBinding itemNoticeBinding) {
        super(itemNoticeBinding);
    }

    @Override
    protected void bind(NoticeData noticeData) {
        getViewBinding().setNotice(noticeData);
    }
}