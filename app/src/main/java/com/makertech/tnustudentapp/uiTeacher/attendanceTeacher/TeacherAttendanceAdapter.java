package com.makertech.tnustudentapp.uiTeacher.attendanceTeacher;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.data.local.AttendanceListData;
import com.makertech.tnustudentapp.databinding.ItemTeacherTakeAttendanceBinding;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class TeacherAttendanceAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
List<AttendanceListData> data;

    public TeacherAttendanceAdapter(List<AttendanceListData> data) {
        this.data = data;
    }

    @NonNull
    @NotNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        ItemTeacherTakeAttendanceBinding itemTeacherTakeAttendanceBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_teacher_take_attendance,parent,false);
        return new TeacherAttendanceViewHolder(itemTeacherTakeAttendanceBinding);

    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder holder, int position) {
        AttendanceListData attendanceListData = data.get(position);
        TeacherAttendanceViewHolder teacherAttendanceViewHolder = (TeacherAttendanceViewHolder) holder;
        teacherAttendanceViewHolder.bind(attendanceListData);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
