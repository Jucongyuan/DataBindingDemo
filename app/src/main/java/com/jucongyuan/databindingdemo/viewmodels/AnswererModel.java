package com.jucongyuan.databindingdemo.viewmodels;

import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.jucongyuan.databindingdemo.adapter.AnswererAdapter;
import com.jucongyuan.databindingdemo.fragment.AnswererFragment;
import com.jucongyuan.databindingdemo.listener.OnRecyclerViewItemClickListener;
import com.jucongyuan.databindingdemo.models.Answerer;

/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 7/6/16 3:47 PM
 */
public class AnswererModel implements OnRecyclerViewItemClickListener {

    public ObservableArrayList<Answerer> answerers = new ObservableArrayList<>();
    public OnRecyclerViewItemClickListener onRecyclerViewItemClickListener;

    private AnswererFragment answererFragment;

    public AnswererModel(AnswererFragment answererFragment) {
        this.answererFragment = answererFragment;

        Answerer answerer = new Answerer("在线", "http://ww2.sinaimg.cn/crop.0.603.1183.1183.1024/7492627ajw8eykga6mvazj20xc1n6dlu.jpg", "春天的火车", "男", true, "成都有限公司创始人", "四川>成都市>金牛区", 4562, 45644);
        Answerer answerer1 = new Answerer("离线", "http://img3.imgtn.bdimg.com/it/u=1033649457,1987438146&fm=21&gp=0.jpg", "冬天的火车", "女", false, "成都有限公司创始人", "四川>成都市>高新区", 4565, 45644);
        answerers.add(answerer);
        answerers.add(answerer1);
        answerers.add(answerer);
        answerers.add(answerer);
        answerers.add(answerer1);
        answerers.add(answerer);
        answerers.add(answerer1);
        answerers.add(answerer);

    }


    @BindingAdapter("answereritems")
    public static void bindList(RecyclerView recyclerView, ObservableArrayList<Answerer> answerers) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(recyclerView.getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new AnswererAdapter(answerers));
    }

    @BindingAdapter("listener")
    public static void addListener(RecyclerView recyclerView, OnRecyclerViewItemClickListener onRecyclerViewItemClickListener) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(recyclerView.getContext());
        recyclerView.setLayoutManager(layoutManager);
        ((AnswererAdapter) recyclerView.getAdapter()).setOnRecyclerViewItemClickListener(onRecyclerViewItemClickListener);
    }


    @Override
    public void onItemClick(View view, Object object) {
    }
}
