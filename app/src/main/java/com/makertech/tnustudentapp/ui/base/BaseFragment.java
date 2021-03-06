package com.makertech.tnustudentapp.ui.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

public abstract class BaseFragment<V extends ViewDataBinding,VM extends BaseViewModel> extends Fragment {
    private V viewBinding;
    private VM viewModel;
    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        viewBinding = DataBindingUtil.inflate(inflater,getLayoutId(),container,false);
        viewModel = initialViewModel();
        viewBinding.setVariable(getBindingVariable(),viewModel);
        viewBinding.executePendingBindings();
        initView();
        return viewBinding.getRoot();
    }


    /***
     * it is used to do work related to specific requirements of  sub class related to view
     */
    protected abstract void initView();

    /***
     *  It is used to provide layout id specific to your child class
     * @return
     */
    protected abstract Integer getBindingVariable();

    /***
     *
     * @return
     */
    protected   abstract VM initialViewModel();
    protected abstract Integer getLayoutId();
    public V getViewBinding() {
        return viewBinding;
    }

    public VM getViewModel() {
        return viewModel;
    }
}
