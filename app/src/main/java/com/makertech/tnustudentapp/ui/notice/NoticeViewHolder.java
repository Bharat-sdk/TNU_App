package com.makertech.tnustudentapp.ui.notice;

import com.makertech.tnustudentapp.data.local.NoticeData;
import com.makertech.tnustudentapp.databinding.ItemNoticeBinding;
import com.makertech.tnustudentapp.ui.base.BaseViewHolder;

public class NoticeViewHolder extends BaseViewHolder<NoticeData, ItemNoticeBinding> {
    public NoticeViewHolder(ItemNoticeBinding itemNoticeBinding) {
        super(itemNoticeBinding);
    }

    @Override
    protected void bind(NoticeData noticeData) {
        getViewBinding().setNotice(noticeData);
    }
}
