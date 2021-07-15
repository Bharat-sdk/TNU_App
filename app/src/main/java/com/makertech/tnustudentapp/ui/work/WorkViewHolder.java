package com.makertech.tnustudentapp.ui.work;

import com.makertech.tnustudentapp.data.local.WorkData;
import com.makertech.tnustudentapp.databinding.ItemWorkBinding;
import com.makertech.tnustudentapp.ui.base.BaseViewHolder;

public class WorkViewHolder extends BaseViewHolder<WorkData,ItemWorkBinding> {
    public WorkViewHolder(ItemWorkBinding itemWorkBinding) {
        super(itemWorkBinding);
    }

    @Override
    protected void bind(WorkData workData) {
       getViewBinding().setWork(workData);
    }
}
