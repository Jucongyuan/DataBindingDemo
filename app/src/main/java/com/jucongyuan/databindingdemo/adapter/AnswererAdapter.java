package com.jucongyuan.databindingdemo.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.jucongyuan.databindingdemo.BR;
import com.jucongyuan.databindingdemo.R;
import com.jucongyuan.databindingdemo.databinding.ItemAnswererBinding;
import com.jucongyuan.databindingdemo.listener.OnRecyclerViewItemClickListener;
import com.jucongyuan.databindingdemo.models.Answerer;

import java.util.ArrayList;

/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 6/28/16 2:59 PM
 */
public class AnswererAdapter extends RecyclerView.Adapter<AnswererAdapter.ViewHolder> {

    private ArrayList<Answerer> answerers = new ArrayList<>();
    private OnRecyclerViewItemClickListener onRecyclerViewItemClickListener;

    public AnswererAdapter(ArrayList<Answerer> answerers) {
        this.answerers.addAll(answerers);
    }

    public void setOnRecyclerViewItemClickListener(OnRecyclerViewItemClickListener onRecyclerViewItemClickListener) {
        this.onRecyclerViewItemClickListener = onRecyclerViewItemClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemAnswererBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_answerer, parent, false);
        ViewHolder holder = new ViewHolder(binding.getRoot());
        holder.setBinding(binding);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Answerer answerer = answerers.get(position);
        holder.getBinding().setVariable(BR.answerer, answerer);
        holder.getBinding().executePendingBindings();
        ItemAnswererBinding binding = (ItemAnswererBinding) holder.getBinding();
        binding.sdvAvatar.setImageURI(Uri.parse(answerer.getAvatar()));
        binding.getRoot().setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                onRecyclerViewItemClickListener.onItemClick(v, answerer);
            }
        });

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
