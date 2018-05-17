package com.example.wangwei.mvvmdemo.activity;

import android.content.Intent
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.wangwei.mvvmdemo.BR
import com.example.wangwei.mvvmdemo.R
import com.example.wangwei.mvvmdemo.base.BaseActivity
import com.example.wangwei.mvvmdemo.viewmodel.EntityViewModel
import kotlinx.android.synthetic.main.activity_main.*

public class MainActivity : BaseActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setMyContentView(R.layout.activity_main)

        var model = EntityViewModel();
        setVariable(model)
        model.getData(this);
    }


    fun onClick( view:View){
        var intent = Intent(view.getContext(), RecycleViewActivity::class.java);
        view.getContext().startActivity(intent);
    }
}
