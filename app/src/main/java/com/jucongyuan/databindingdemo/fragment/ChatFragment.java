package com.jucongyuan.databindingdemo.fragment;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jucongyuan.databindingdemo.R;
import com.jucongyuan.databindingdemo.databinding.FragmentChatBinding;
import com.jucongyuan.databindingdemo.viewmodels.ChatModel;


/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 6/27/16 3:55 PM
 */
public class ChatFragment extends Fragment {

    private static ChatFragment chatFragment;

    public static ChatFragment init() {
        if (chatFragment == null) {
            chatFragment = new ChatFragment();
        }
        return chatFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentChatBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_chat, container, false);
        binding.setChatModel(new ChatModel(this));
        return binding.getRoot();
    }
}
