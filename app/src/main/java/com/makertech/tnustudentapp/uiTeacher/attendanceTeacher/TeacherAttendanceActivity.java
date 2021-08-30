package com.makertech.tnustudentapp.uiTeacher.attendanceTeacher;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;

import androidx.databinding.library.baseAdapters.BR;

import com.google.gson.Gson;
import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.data.local.AttendanceListData;
import com.makertech.tnustudentapp.data.network.takeattendance.Responseattendancelist;
import com.makertech.tnustudentapp.databinding.ActivityTeacherAttendanceBinding;
import com.makertech.tnustudentapp.ui.base.BaseActivity;
import com.makertech.tnustudentapp.utils.Utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TeacherAttendanceActivity extends BaseActivity<ActivityTeacherAttendanceBinding, TeacherAttendanceViewModel> {
    List<AttendanceListData> attendanceList = new ArrayList<>();
    Calendar calendar;
    String time;


    @Override
    protected void initView() {
        String str = Utils.getJsonFromAssets(getApplicationContext(),"takeattendancejson.json");
        Gson gson = new Gson();
        Responseattendancelist responseattendancelist = gson.fromJson(str,Responseattendancelist.class);


        TeacherAttendanceAdapter teacherAttendanceAdapter = new TeacherAttendanceAdapter(responseattendancelist.getAttendanceList());
        getViewBinding().attendanceSheetRecyclerView.setAdapter(teacherAttendanceAdapter);

        getViewBinding().txtSelectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendar = Calendar.getInstance();
                DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        calendar.set(Calendar.YEAR, year);
                        calendar.set(Calendar.MONTH, month);
                        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);

                        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMM-yyyy");
                        time = (simpleDateFormat.format(calendar.getTime()));
                        getViewBinding().txtSelectDate.setText(time);
                    }
                };
                new DatePickerDialog(TeacherAttendanceActivity.this,dateSetListener,calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();
            }


        });

    }

    @Override
    protected Integer getBindingVariable() {
        return BR._all;
    }

    @Override
    protected TeacherAttendanceViewModel initialViewModel() {
        return new TeacherAttendanceViewModel() ;
    }

    @Override
    protected Integer getLayoutId() {
        return R.layout.activity_teacher_attendance;
    }

    // local data
   /*public List<AttendanceListData> preparesList()
    {

        AttendanceListData attendanceListData = new AttendanceListData("Bharat Kumar",false);
        attendanceList.add(attendanceListData);
        attendanceListData = new AttendanceListData("Raj Zamal",false);
        attendanceList.add(attendanceListData);
        attendanceListData = new AttendanceListData("Amay Lugun",false);
        attendanceList.add(attendanceListData);
        attendanceListData = new AttendanceListData("Siddharth Darnal",false);
        attendanceList.add(attendanceListData);
        attendanceListData = new AttendanceListData("Nelson Darjee",false);
        attendanceList.add(attendanceListData);
        attendanceListData = new AttendanceListData("Shruti Agarwal",false);
        attendanceList.add(attendanceListData);
        return attendanceList;

    }*/
}
