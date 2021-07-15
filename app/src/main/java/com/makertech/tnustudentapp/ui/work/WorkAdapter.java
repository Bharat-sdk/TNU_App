package com.makertech.tnustudentapp.ui.work;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.data.local.WorkData;
import com.makertech.tnustudentapp.databinding.ItemWorkBinding;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class WorkAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<WorkData> data;
    public WorkAdapter(List<WorkData> workDataList) {
        this.data = workDataList;
    }

    @NonNull
    @NotNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        ItemWorkBinding itemWorkBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_work,parent,false);
        return new WorkViewHolder(itemWorkBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder holder, int position) {
        WorkData workData = data.get(position);
        WorkViewHolder workViewHolder = (WorkViewHolder) holder;
     //   workViewHolder.getViewBinding().button;
        workViewHolder.bind(workData);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}

