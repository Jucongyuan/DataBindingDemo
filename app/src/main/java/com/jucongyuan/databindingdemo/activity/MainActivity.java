package com.jucongyuan.databindingdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioGroup;

import com.jucongyuan.databindingdemo.R;
import com.jucongyuan.databindingdemo.fragment.MainFragmentFactory;


/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 6/27/16 1:50 PM
 */
public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener {

    public static final int REQUEST_CODE_LOGIN_REGISTER_RESULT = 0x002;

    private FragmentManager fragmentManager;
    private RadioGroup radioGroup;
    private int index;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        checkDefault();
    }

    private void init() {
        fragmentManager = getSupportFragmentManager();
        radioGroup = (RadioGroup) findViewById(R.id.rgTab);
        assert radioGroup != null;
        radioGroup.setOnCheckedChangeListener(this);
    }

    public void changeTab() {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        Fragment fragment = MainFragmentFactory.getInstanceByIndex(index);
        transaction.replace(R.id.flContent, fragment);
        transaction.commitAllowingStateLoss();
    }


    private void checkDefault() {
        radioGroup.check(R.id.rbHome);
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int index) {
        this.index = index;
        changeTab();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_CODE_LOGIN_REGISTER_RESULT) {
            changeTab();
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
