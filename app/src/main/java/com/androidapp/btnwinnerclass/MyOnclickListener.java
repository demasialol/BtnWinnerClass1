package com.androidapp.btnwinnerclass;

import android.view.View;

public class MyOnclickListener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnclickListener(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        mainActivity.mTextview1.setText("you clicked button1");


    }
}
