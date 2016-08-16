package com.jucongyuan.databindingdemo.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jucongyuan.databindingdemo.BR;
import com.jucongyuan.databindingdemo.R;
import com.jucongyuan.databindingdemo.databinding.ItemChatBinding;
import com.jucongyuan.databindingdemo.models.Answerer;

import java.util.ArrayList;

/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 7/6/16 4:36 PM
 */
public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {

    private ArrayList<Answerer> answerers = new ArrayList<>();


    public ChatAdapter(ArrayList<Answerer> answerers) {
        this.answerers.addAll(answerers);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemChatBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_chat, parent, false);
        ViewHolder holder = new ViewHolder(binding.getRoot());
        holder.setBinding(binding);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Answerer answerer = answerers.get(position);
        holder.getBinding().setVariable(BR.answerer, answerer);
        holder.getBinding().executePendingBindings();
        ItemChatBinding binding = (ItemChatBinding) holder.getBinding();
        binding.sdvAvatar.setImageURI(Uri.parse(answerer.getAvatar()));
    }

    @Override
    public int getItemCount() {
        return answerers.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ViewDataBinding binding;

        public ViewHolder(View itemView) {
            super(itemView);
        }

        public void setBinding(ViewDataBinding binding) {
            this.binding = binding;
        }

        public ViewDataBinding getBinding() {
            return this.binding;
        }
    }

}
