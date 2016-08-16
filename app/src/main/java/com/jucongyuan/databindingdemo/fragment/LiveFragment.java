package com.jucongyuan.databindingdemo.fragment;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jucongyuan.databindingdemo.R;
import com.jucongyuan.databindingdemo.databinding.FragmentLiveBinding;


/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 6/28/16 10:25 AM
 */
public class LiveFragment extends Fragment {

    private static LiveFragment liveFragment;

    public static LiveFragment init() {
        if (liveFragment == null) {
            liveFragment = new LiveFragment();
        }
        return liveFragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentLiveBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_live, container, false);
        return binding.getRoot();
    }
}
