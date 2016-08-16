package com.jucongyuan.databindingdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

import com.jucongyuan.databindingdemo.R;
import com.jucongyuan.databindingdemo.utils.SystemUtil;


/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 6/27/16 1:48 PM
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                View view = getCurrentFocus();
                SystemUtil.hideKeyboard(ev, view, BaseActivity.this);
                break;

            default:
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    protected void initNavigationBar() {
        findViewById(R.id.btnBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

}
