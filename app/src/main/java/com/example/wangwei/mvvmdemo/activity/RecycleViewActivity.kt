package com.example.wangwei.mvvmdemo.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.wangwei.mvvmdemo.R;
import com.example.wangwei.mvvmdemo.BR;
import com.example.wangwei.mvvmdemo.base.BaseActivity
import com.example.wangwei.mvvmdemo.viewmodel.RecycleViewModel;

class RecycleViewActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setMyContentView(R.layout.activity_recycleview)

        var viewModel = RecycleViewModel();
        setVariable(viewModel)

        viewModel.loadData(this);
    }


}
