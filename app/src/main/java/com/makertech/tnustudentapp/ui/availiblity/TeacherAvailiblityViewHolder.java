package com.makertech.tnustudentapp.ui.availiblity;

import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.data.local.TeacherAvailiblity;
import com.makertech.tnustudentapp.databinding.ItemTeacherAvailibalityBinding;
import com.makertech.tnustudentapp.ui.base.BaseViewHolder;

public class TeacherAvailiblityViewHolder extends BaseViewHolder<TeacherAvailiblity, ItemTeacherAvailibalityBinding> {
    public TeacherAvailiblityViewHolder(ItemTeacherAvailibalityBinding itemTeacherAvailibalityBinding) {
        super(itemTeacherAvailibalityBinding);
    }

    @Override
    protected void bind(TeacherAvailiblity teacherAvailiblity) {
         boolean teacherAvailiblityAvailable = teacherAvailiblity.isAvailable();
         String teacherName = teacherAvailiblity.getTeacher_name();
         String capitalLetterTeacherName = String.valueOf(teacherName.charAt(0));
         if (teacherAvailiblityAvailable)
         {
             getViewBinding().imgAvailableOrNot.setImageResource(R.drawable.teacher_availibality_available_indicator);
         }
         else {
             getViewBinding().imgAvailableOrNot.setImageResource(R.drawable.teacher_availiblity_unavailable_indicator);
         }

         getViewBinding().txtTeacherName.setText(teacherName);
         getViewBinding().txtCapitalLetterTeacherName.setText(capitalLetterTeacherName);


    }
}
