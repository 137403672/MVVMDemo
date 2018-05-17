package com.example.wangwei.mvvmdemo.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.wangwei.mvvmdemo.BR;

import com.example.wangwei.mvvmdemo.R;
import com.example.wangwei.mvvmdemo.activity.RecycleViewActivity;
import com.example.wangwei.mvvmdemo.adapter.MyAdapter;
import com.example.wangwei.mvvmdemo.base.BaseViewModel
import com.example.wangwei.mvvmdemo.model.EntityModel;
import com.example.wangwei.mvvmdemo.utils.FileUtils;
import com.google.gson.Gson;

import java.util.List;

 class EntityViewModel:BaseViewModel()  {

    var entityModel:ObservableField<EntityModel> =  ObservableField<EntityModel>( EntityModel());
    fun getData(context:Context ) {
        //从网络获取数据
        var json = FileUtils.getAssetString(context,"json1.json");
        var gson =  Gson();
        var entityModel = gson.fromJson(json, EntityModel::class.java);
        this.entityModel.set(entityModel);
    }
}
