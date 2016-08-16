package com.jucongyuan.databindingdemo.fragment;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jucongyuan.databindingdemo.R;
import com.jucongyuan.databindingdemo.databinding.FragmentAnswererBinding;
import com.jucongyuan.databindingdemo.viewmodels.AnswererModel;


/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 6/28/16 10:25 AM
 */
public class AnswererFragment extends Fragment {

    private static AnswererFragment answererFragment;

    public static AnswererFragment init() {
        if (answererFragment == null) {
            answererFragment = new AnswererFragment();
        }
        return answererFragment;
    }

    private FragmentAnswererBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_answerer, container, false);
        binding.setAnswererModel(new AnswererModel(this));
        return binding.getRoot();
    }
}
