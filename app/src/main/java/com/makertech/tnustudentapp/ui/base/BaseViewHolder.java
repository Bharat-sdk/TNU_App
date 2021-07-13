package com.makertech.tnustudentapp.ui.base;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

import org.jetbrains.annotations.NotNull;

abstract public class BaseViewHolder<D,V extends ViewBinding> extends RecyclerView.ViewHolder {
    private final V viewBinding;
    public BaseViewHolder(V v) {
        super(v.getRoot());
        viewBinding = v;
    }

    public V getViewBinding() {
        return viewBinding;
    }

    protected abstract void bind(D d);
}