package com.jucongyuan.databindingdemo.viewmodels;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Toast;

import com.jucongyuan.databindingdemo.fragment.HomeFragment;


/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 7/12/16 2:38 PM
 */
public class HomeModel {

    private HomeFragment homeFragment;
    private String strSearch;

    public HomeModel(HomeFragment homeFragment) {
        this.homeFragment = homeFragment;
    }


    public TextWatcher searchWatcher = new TextWatcher() {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            strSearch = s.toString();
        }
    };

    public void searchClick() {
        if (TextUtils.isEmpty(strSearch)) {
            Toast.makeText(homeFragment.getContext(), "请输入搜索内容!", Toast.LENGTH_LONG).show();
            return;
        }
    }

}
