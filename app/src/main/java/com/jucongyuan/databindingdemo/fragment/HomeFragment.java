package com.jucongyuan.databindingdemo.fragment;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.jucongyuan.databindingdemo.R;
import com.jucongyuan.databindingdemo.adapter.HomeFragmentPagerAdapter;
import com.jucongyuan.databindingdemo.databinding.FragmentHomeBinding;
import com.jucongyuan.databindingdemo.viewmodels.HomeModel;

/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 6/27/16 3:55 PM
 */
public class HomeFragment extends Fragment implements ViewPager.OnPageChangeListener, RadioGroup.OnCheckedChangeListener {

    private static HomeFragment homeFragment;

    public static HomeFragment init() {
        if (homeFragment == null) {
            homeFragment = new HomeFragment();
        }
        return homeFragment;
    }


    private ViewPager vpFirst;
    private HomeFragmentPagerAdapter homeFragmentPagerAdapter;
    private RadioGroup radioGroup;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentHomeBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        binding.setHomeModel(new HomeModel(this));
        View rootView = binding.getRoot();
        vpFirst = binding.vpFirst;
        homeFragmentPagerAdapter = new HomeFragmentPagerAdapter(getChildFragmentManager());
        vpFirst.setAdapter(homeFragmentPagerAdapter);
        vpFirst.addOnPageChangeListener(this);
        radioGroup = binding.rgTab;
        radioGroup.setOnCheckedChangeListener(this);
        radioGroup.check(R.id.rbAnswerer);
        return rootView;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position) {
            case 0:
                if (radioGroup.getCheckedRadioButtonId() != R.id.rbAnswerer) {
                    radioGroup.check(R.id.rbAnswerer);
                }
                break;
            case 1:
                if (radioGroup.getCheckedRadioButtonId() != R.id.rbLive) {
                    radioGroup.check(R.id.rbLive);
                }
                break;
            case 2:
                if (radioGroup.getCheckedRadioButtonId() != R.id.rbQuesAndAns) {
                    radioGroup.check(R.id.rbQuesAndAns);
                }
                break;
            case 3:
                if (radioGroup.getCheckedRadioButtonId() != R.id.rbArticle) {
                    radioGroup.check(R.id.rbArticle);
                }
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.rbAnswerer:
                if (vpFirst.getCurrentItem() != 0) {
                    vpFirst.setCurrentItem(0);
                }
                break;
            case R.id.rbLive:
                if (vpFirst.getCurrentItem() != 1) {
                    vpFirst.setCurrentItem(1);
                }
                break;
            case R.id.rbQuesAndAns:
                if (vpFirst.getCurrentItem() != 2) {
                    vpFirst.setCurrentItem(2);
                }
                break;
            case R.id.rbArticle:
                if (vpFirst.getCurrentItem() != 3) {
                    vpFirst.setCurrentItem(3);
                }
                break;
        }
    }


}
