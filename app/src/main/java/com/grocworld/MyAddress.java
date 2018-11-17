package com.grocworld;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import common.AppController;

/**
 * Created by ashish.kumar on 16-07-2018.
 */

public class MyAddress extends Activity implements View.OnClickListener {
    AppController controller;
    @BindView(R.id.back)
    ImageView back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        controller = (AppController) getApplicationContext();
        ButterKnife.bind(this);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                onBackPressed();
                break;
        }

    }
}