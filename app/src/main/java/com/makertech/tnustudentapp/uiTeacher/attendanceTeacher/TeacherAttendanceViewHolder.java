package com.makertech.tnustudentapp.uiTeacher.attendanceTeacher;

import com.makertech.tnustudentapp.data.local.AttendanceListData;
import com.makertech.tnustudentapp.databinding.ItemTeacherTakeAttendanceBinding;
import com.makertech.tnustudentapp.ui.base.BaseViewHolder;

public class TeacherAttendanceViewHolder extends BaseViewHolder<AttendanceListData, ItemTeacherTakeAttendanceBinding> {


    public TeacherAttendanceViewHolder(ItemTeacherTakeAttendanceBinding itemTeacherTakeAttendanceBinding) {
        super(itemTeacherTakeAttendanceBinding);
    }

    @Override
    protected void bind(AttendanceListData attendanceListData) {
        getViewBinding().txtStudentName.setText(attendanceListData.getStudent_name());
    }
}

