package com.makertech.tnustudentapp.ui.timetable;

import com.makertech.tnustudentapp.data.local.DailyTimeTable;
import com.makertech.tnustudentapp.data.local.TimetableDataSource;
import com.makertech.tnustudentapp.data.network.timetable.SubjectsItem;
import com.makertech.tnustudentapp.databinding.ItemDailyRoutineBinding;
import com.makertech.tnustudentapp.ui.base.BaseViewHolder;
import com.makertech.tnustudentapp.ui.base.BaseViewModel;

public class TimetableViewHolder extends BaseViewHolder<SubjectsItem, ItemDailyRoutineBinding> {
    public TimetableViewHolder(ItemDailyRoutineBinding itemDailyRoutineBinding) {
        super(itemDailyRoutineBinding);
    }

    @Override
    protected void bind(SubjectsItem dailyTimeTable) {
        String sub = dailyTimeTable.getSubjecttitle();
         String chare= String.valueOf(sub.charAt(0));
        getViewBinding().setDayWiseRoutine(dailyTimeTable);
        getViewBinding().txtCapitalLetterWeekday.setText(chare);
    }
}
