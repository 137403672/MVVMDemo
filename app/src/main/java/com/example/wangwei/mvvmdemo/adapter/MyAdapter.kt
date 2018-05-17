package com.example.wangwei.mvvmdemo.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Parcel
import android.os.Parcelable
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wangwei.mvvmdemo.R;
import com.example.wangwei.mvvmdemo.BR;
import com.example.wangwei.mvvmdemo.base.BaseRecycleAdapter
import com.example.wangwei.mvvmdemo.model.EntityModel;
import com.example.wangwei.mvvmdemo.utils.BindingAdapterUtils.setDatas

import java.util.Collection;
import java.util.List;

 class MyAdapter(context:Context) : BaseRecycleAdapter<EntityModel>(context) {


    override fun  onCreateViewHolder(parent:ViewGroup , viewType:Int ):BaseHolder {
        var binding = DataBindingUtil.inflate<ViewDataBinding>(LayoutInflater.from(context), R.layout.item_recycle, null, false);
        var myHolder = BaseHolder(binding);
        return myHolder;
    }

    override fun onBindViewHolder(holder:BaseHolder , position: Int ) {
        holder.binding.setVariable(BR.viewModel,getItem(position));
        holder.binding.getRoot().setOnClickListener( View.OnClickListener() {
            getItem(position)?.innerModel?.content = getItem(position)?.innerModel?.content+"1";
            notifyDataSetChanged();
        });
    }




    class MyHolder : RecyclerView.ViewHolder{
        var binding: ViewDataBinding ;
       constructor(binding:ViewDataBinding) : super(binding.root) {
            this.binding = binding;
        }
    }

 }
