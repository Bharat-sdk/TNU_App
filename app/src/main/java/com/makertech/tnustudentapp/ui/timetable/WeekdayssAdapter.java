package com.makertech.tnustudentapp.ui.timetable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makertech.tnustudentapp.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class WeekdayssAdapter extends RecyclerView.Adapter<WeekdayssAdapter.ViewHolder> {

    List<String> weekdayNames;

    public WeekdayssAdapter(List<String>weekdayNames) {
        this.weekdayNames = weekdayNames;
    }

    @NonNull
    @NotNull
    @Override
    public WeekdayssAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View item = layoutInflater.inflate(R.layout.item_weekdays, parent, false);
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull WeekdayssAdapter.ViewHolder holder, int position) {
        String dayName = weekdayNames.get(position);
        char day_first_letter = dayName.charAt(0);
        holder.txt_day.setText(dayName);
        holder.txt_day_letter.setText(day_first_letter);

    }

    @Override
    public int getItemCount() {
        return weekdayNames.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_day,txt_day_letter;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            txt_day = itemView.findViewById(R.id.txt_weekday);
            txt_day_letter = itemView.findViewById(R.id.txt_capital_letter_weekday);
        }
    }
}
