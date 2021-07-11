package com.makertech.tnustudentapp.ui.base;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

import org.jetbrains.annotations.NotNull;

abstract public class BaseViewHolder<V extends ViewBinding> extends RecyclerView.ViewHolder {
    public BaseViewHolder(@NonNull @NotNull View itemView) {

        super(itemView);
    }
}
