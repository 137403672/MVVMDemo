package com.example.wangwei.mvvmdemo.viewmodel;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wangwei.mvvmdemo.R;
import com.example.wangwei.mvvmdemo.adapter.MyAdapter;
import com.example.wangwei.mvvmdemo.base.BaseViewModel
import com.example.wangwei.mvvmdemo.model.EntityModel;
import com.example.wangwei.mvvmdemo.model.RecycleModel;
import com.example.wangwei.mvvmdemo.utils.FileUtils;
import com.google.gson.Gson;

import java.util.List;

public class RecycleViewModel: BaseViewModel() {
    var model =  ObservableField<RecycleModel>();

    fun loadData(context:Context ) {
        //从网络获取数据
        var json = FileUtils.Companion.getAssetString(context,"json2.json");
        var gson =  Gson();
        var recycleModel = gson.fromJson(json, RecycleModel::class.java);
        model.set(recycleModel);

    }



};
