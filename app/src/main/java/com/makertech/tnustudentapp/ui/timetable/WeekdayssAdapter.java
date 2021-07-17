package com.makertech.tnustudentapp.ui.timetable;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
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
        String day_first_letter = String.valueOf(dayName.charAt(0));
        holder.txt_day.setText(dayName);
      holder.txt_day_letter.setText(day_first_letter);
      holder.card_weekday.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            String dayname1 = holder.txt_day.getText().toString();
              Intent intent = new Intent(holder.context,TimetableFragment.class);
              intent.putExtra("day",dayname1);
              holder.context.startActivity(intent);
          }
      });

    }

    @Override
    public int getItemCount() {
        return weekdayNames.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_day,txt_day_letter;
        CardView card_weekday;
        Context context;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            txt_day = itemView.findViewById(R.id.txt_weekday);
            txt_day_letter = itemView.findViewById(R.id.txt_capital_letter_weekday);
            card_weekday = itemView.findViewById(R.id.card_weekday);
            context = itemView.getContext();
        }
    }
}
