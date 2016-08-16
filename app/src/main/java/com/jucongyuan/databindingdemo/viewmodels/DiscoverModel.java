package com.jucongyuan.databindingdemo.viewmodels;

import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jucongyuan.databindingdemo.adapter.DiscoverAdapter;
import com.jucongyuan.databindingdemo.fragment.DiscoverFragment;
import com.jucongyuan.databindingdemo.models.Reviewer;
import com.jucongyuan.databindingdemo.models.Share;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 7/6/16 5:07 PM
 */
public class DiscoverModel {

    public ObservableArrayList<Share> shares = new ObservableArrayList<>();

    private DiscoverFragment discoverFragment;


    public DiscoverModel(DiscoverFragment discoverFragment) {
        this.discoverFragment = discoverFragment;


        Share share = new Share();
        share.setType(Share.Type.FORWARDING.getType());
        share.setAvatar("http://img3.imgtn.bdimg.com/it/u=1033649457,1987438146&fm=21&gp=0.jpg");
        share.setAuthor("自媒体");
        share.setDate("2016-1-18");
        share.setContent("这是我转发的话，正式上线了，上线了，上线了。");

        Share shareF = new Share();
        List<String> images = new ArrayList<>();
        images.add("http://desk.fd.zol-img.com.cn/t_s960x600c5/g5/M00/02/04/ChMkJlbKyBmIHnT1AARH98qGLIsAALH9QAYXO8ABEgP381.jpg");
        shareF.setImgages(images);
        shareF.setTitle("凤凰涅槃，产品今天正式上线");
        shareF.setReadNumber(182);
        shareF.setThumbsUpNumber(48);
        List<Reviewer> reviewers = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            reviewers.add(new Reviewer());
        }
        shareF.setReviewers(reviewers);
        share.setForwarding(shareF);
        shares.add(share);


    }

    @BindingAdapter("discoveritems")
    public static void bindList(RecyclerView recyclerView, ObservableArrayList<Share> shares) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(recyclerView.getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new DiscoverAdapter(shares));
    }

}
