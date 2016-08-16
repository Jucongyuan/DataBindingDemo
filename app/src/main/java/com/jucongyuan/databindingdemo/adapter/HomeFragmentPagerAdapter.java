package com.jucongyuan.databindingdemo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.jucongyuan.databindingdemo.fragment.AnswererFragment;
import com.jucongyuan.databindingdemo.fragment.ArticleFragment;
import com.jucongyuan.databindingdemo.fragment.LiveFragment;
import com.jucongyuan.databindingdemo.fragment.QuesAndAnsFragment;

/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 6/28/16 10:23 AM
 */
public class HomeFragmentPagerAdapter extends FragmentPagerAdapter {

    public HomeFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = AnswererFragment.init();
                break;
            case 1:
                fragment = LiveFragment.init();
                break;
            case 2:
                fragment = QuesAndAnsFragment.init();
                break;
            case 3:
                fragment = ArticleFragment.init();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
