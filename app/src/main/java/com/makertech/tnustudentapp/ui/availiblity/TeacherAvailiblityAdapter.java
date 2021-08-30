package com.makertech.tnustudentapp.ui.availiblity;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.data.local.TeacherAvailiblity;
import com.makertech.tnustudentapp.data.network.teacheravailiblity.TeacherAvaiibalityItem;
import com.makertech.tnustudentapp.databinding.ItemTeacherAvailibalityBinding;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class TeacherAvailiblityAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<TeacherAvaiibalityItem> data;

    public TeacherAvailiblityAdapter(List<TeacherAvaiibalityItem> data) {
        this.data = data;
    }

    @NonNull
    @NotNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        ItemTeacherAvailibalityBinding itemTeacherAvailibalityBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_teacher_availibality,parent,false);
        return new TeacherAvailiblityViewHolder(itemTeacherAvailibalityBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder holder, int position) {
        TeacherAvaiibalityItem teacherAvailiblity = data.get(position);
        TeacherAvailiblityViewHolder teacherAvailiblityViewHolder = (TeacherAvailiblityViewHolder) holder;
        teacherAvailiblityViewHolder.bind(teacherAvailiblity);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
