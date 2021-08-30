package com.makertech.tnustudentapp.uiTeacher.attendanceTeacher;

import com.makertech.tnustudentapp.data.local.AttendanceListData;
import com.makertech.tnustudentapp.data.network.takeattendance.AttendanceListItem;
import com.makertech.tnustudentapp.databinding.ItemTeacherTakeAttendanceBinding;
import com.makertech.tnustudentapp.ui.base.BaseViewHolder;

public class TeacherAttendanceViewHolder extends BaseViewHolder<AttendanceListItem, ItemTeacherTakeAttendanceBinding> {


    public TeacherAttendanceViewHolder(ItemTeacherTakeAttendanceBinding itemTeacherTakeAttendanceBinding) {
        super(itemTeacherTakeAttendanceBinding);
    }

    @Override
    protected void bind(AttendanceListItem attendanceListData) {
        getViewBinding().txtStudentName.setText(attendanceListData.getStudentName());
    }
}

