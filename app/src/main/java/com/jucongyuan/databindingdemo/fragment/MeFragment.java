package com.jucongyuan.databindingdemo.fragment;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jucongyuan.databindingdemo.R;
import com.jucongyuan.databindingdemo.databinding.FragmentMeBinding;
import com.jucongyuan.databindingdemo.viewmodels.MeModel;


/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 6/27/16 3:55 PM
 */
public class MeFragment extends Fragment {

    private static MeFragment meFragment;

    public static MeFragment init() {
        if (meFragment == null) {
            meFragment = new MeFragment();
        }
        return meFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentMeBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_me, container, false);
        binding.setMeModel(new MeModel(this, binding.sdvAvatar));
        return binding.getRoot();
    }
}
