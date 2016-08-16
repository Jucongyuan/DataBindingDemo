package com.jucongyuan.databindingdemo.fragment;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jucongyuan.databindingdemo.R;
import com.jucongyuan.databindingdemo.databinding.FragmentDiscoverBinding;
import com.jucongyuan.databindingdemo.viewmodels.DiscoverModel;


/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 6/27/16 3:55 PM
 */
public class DiscoverFragment extends Fragment {

    private static DiscoverFragment discoverFragment;

    public static DiscoverFragment init() {
        if (discoverFragment == null) {
            discoverFragment = new DiscoverFragment();
        }
        return discoverFragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentDiscoverBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_discover, container, false);
        binding.setDiscoverModel(new DiscoverModel(this));
        return binding.getRoot();
    }
}
