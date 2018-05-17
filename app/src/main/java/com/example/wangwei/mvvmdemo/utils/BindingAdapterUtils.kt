package com.example.wangwei.mvvmdemo.utils;

import android.databinding.BindingAdapter
import android.databinding.DataBindingComponent
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.wangwei.mvvmdemo.adapter.MyAdapter
import com.example.wangwei.mvvmdemo.model.EntityModel
import java.util.List;

object BindingAdapterUtils  {
    @BindingAdapter("imageUrl")
    @JvmStatic
    fun  loadImage( imageView:ImageView,  imgUrl:String?){
        Glide.with(imageView.getContext()).load(imgUrl).into(imageView);
    }
    @BindingAdapter("datas")
    @JvmStatic
    fun setDatas(recyclerView:RecyclerView ,datas : List<EntityModel>? ){
        recyclerView.setLayoutManager( LinearLayoutManager(recyclerView.getContext(),LinearLayoutManager.VERTICAL,false));
        var myAdapter  =  MyAdapter(recyclerView.getContext());
        myAdapter.setDatas(datas);
        recyclerView.setAdapter(myAdapter);
    }



}
