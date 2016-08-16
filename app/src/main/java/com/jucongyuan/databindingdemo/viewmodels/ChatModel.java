package com.jucongyuan.databindingdemo.viewmodels;

import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jucongyuan.databindingdemo.adapter.ChatAdapter;
import com.jucongyuan.databindingdemo.fragment.ChatFragment;
import com.jucongyuan.databindingdemo.models.Answerer;


/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 7/6/16 4:31 PM
 */
public class ChatModel {

    public ObservableArrayList<Answerer> answerers = new ObservableArrayList<>();

    private ChatFragment chatFragment;

    public ChatModel(ChatFragment chatFragment) {
        this.chatFragment = chatFragment;

        Answerer answerer = new Answerer("在线", "http://ww2.sinaimg.cn/crop.0.603.1183.1183.1024/7492627ajw8eykga6mvazj20xc1n6dlu.jpg", "春天的火车", "男", true, "成都蓝色传奇有限公司创始人", "四川>成都市>金牛区", 4562, 45644);
        Answerer answerer1 = new Answerer("离线", "http://img3.imgtn.bdimg.com/it/u=1033649457,1987438146&fm=21&gp=0.jpg", "冬天的火车", "女", false, "成都蓝色传奇有限公司创始人", "四川>成都市>高新区", 4565, 45644);
        answerers.add(answerer);
        answerers.add(answerer1);
        answerers.add(answerer);
        answerers.add(answerer);
        answerers.add(answerer1);
        answerers.add(answerer);
        answerers.add(answerer1);
        answerers.add(answerer);

    }


    @BindingAdapter("chatitems")
    public static void bindList(RecyclerView recyclerView, ObservableArrayList<Answerer> answerers) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(recyclerView.getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new ChatAdapter(answerers));
    }

}
