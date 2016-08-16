package com.jucongyuan.databindingdemo.fragment;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jucongyuan.databindingdemo.R;
import com.jucongyuan.databindingdemo.databinding.FragmentArticleBinding;


/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 6/28/16 10:25 AM
 */
public class ArticleFragment extends Fragment {

    private static ArticleFragment articleFragment;

    public static ArticleFragment init() {
        if (articleFragment == null) {
            articleFragment = new ArticleFragment();
        }
        return articleFragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentArticleBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_article, container, false);
        return binding.getRoot();
    }
}
