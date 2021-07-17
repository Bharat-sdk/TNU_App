package com.makertech.tnustudentapp.ui.timetable;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.data.local.DailyTimeTable;
import com.makertech.tnustudentapp.databinding.ItemDailyRoutineBinding;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class TimetableAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<DailyTimeTable> data;

    public TimetableAdapter(List<DailyTimeTable> data) {
        this.data = data;
    }

    @NonNull
    @NotNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        ItemDailyRoutineBinding itemDailyRoutineBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_daily_routine,parent,false);
        return new TimetableViewHolder(itemDailyRoutineBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder holder, int position) {
        DailyTimeTable dailyTimeTable = data.get(position);
        TimetableViewHolder timetableViewHolder = (TimetableViewHolder) holder;
        timetableViewHolder.bind(dailyTimeTable);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
