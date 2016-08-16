package com.jucongyuan.databindingdemo.fragment;

import android.support.v4.app.Fragment;

import com.jucongyuan.databindingdemo.R;

/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 6/27/16 4:24 PM
 */
public class MainFragmentFactory {

    public static Fragment getInstanceByIndex(int index) {
        Fragment fragment = null;
        switch (index) {
            case R.id.rbHome:
                fragment = HomeFragment.init();
                break;
            case R.id.rbChat:
                fragment = ChatFragment.init();
                break;
            case R.id.rbDiscover:
                fragment = DiscoverFragment.init();
                break;
            case R.id.rbMe:
                fragment = MeFragment.init();
                break;
            default:
                break;
        }
        return fragment;
    }


}
