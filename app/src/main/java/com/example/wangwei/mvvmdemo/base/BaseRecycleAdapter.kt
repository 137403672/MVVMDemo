package com.example.wangwei.mvvmdemo.base

import android.content.Context
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import java.text.FieldPosition
import java.util.List;

abstract class BaseRecycleAdapter<T>(ct:Context): RecyclerView.Adapter<BaseRecycleAdapter.BaseHolder>() {
    lateinit var context:Context
    init {
        context = ct;
    }
    var list:List<T>?=null;
    fun setDatas(datas:List<T>?){
        this.list = datas;
        notifyDataSetChanged()
    }
    fun addDatas(datas:List<T>){
        this.list?.addAll(datas);
        notifyDataSetChanged()
    }
    override fun getItemCount():Int {
        return  list?.size?:0;
    }

    fun getItem(position: Int): T? {
        return list?.get(position)
    }


    class BaseHolder : RecyclerView.ViewHolder{
        var binding: ViewDataBinding;
        constructor(binding: ViewDataBinding) : super(binding.root) {
            this.binding = binding;
        }

    }
}
