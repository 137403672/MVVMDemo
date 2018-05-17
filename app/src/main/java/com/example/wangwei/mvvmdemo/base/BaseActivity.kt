package com.example.wangwei.mvvmdemo.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.wangwei.mvvmdemo.R
import com.example.wangwei.mvvmdemo.BR

open class BaseActivity : AppCompatActivity() {
    lateinit var binding:ViewDataBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    fun setMyContentView(layoutResID: Int) {
        binding = DataBindingUtil.setContentView<ViewDataBinding>(this, layoutResID);
    }
    fun setVariable(any: Any){
        binding.setVariable(BR.viewModel,any)
    }
}