package com.example.dllo.test0810;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dllo.test0810.base.BaseAty;


public class MainActivity extends BaseAty implements View.OnClickListener {

    private TextView mainTv;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {
        mainTv = bindView(R.id.main_tv);
        setClick(this,mainTv);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {

    }
}
