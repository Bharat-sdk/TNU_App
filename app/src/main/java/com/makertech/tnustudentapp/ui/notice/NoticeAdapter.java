package com.makertech.tnustudentapp.ui.notice;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.data.local.NoticeData;
import com.makertech.tnustudentapp.databinding.ItemNoticeBinding;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class NoticeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<NoticeData> data;
    public NoticeAdapter(List<NoticeData> noticeDataList) {
        this.data = noticeDataList;
    }

    @NonNull
    @NotNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        ItemNoticeBinding itemNoticeBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.item_notice,parent,false);
        return new NoticeViewHolder(itemNoticeBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder holder, int position) {
            NoticeData noticeData = data.get(position);
            NoticeViewHolder noticeViewHolder = (NoticeViewHolder) holder;
            noticeViewHolder.bind(noticeData);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
