package com.jucongyuan.databindingdemo.fragment;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jucongyuan.databindingdemo.R;
import com.jucongyuan.databindingdemo.databinding.FragmentQuesAndAnsBinding;

/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 6/28/16 10:25 AM
 */
public class QuesAndAnsFragment extends Fragment {

    private static QuesAndAnsFragment quesAndAnsFragment;

    public static QuesAndAnsFragment init() {
        if (quesAndAnsFragment == null) {
            quesAndAnsFragment = new QuesAndAnsFragment();
        }
        return quesAndAnsFragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentQuesAndAnsBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_ques_and_ans, container, false);
        return binding.getRoot();
    }
}
