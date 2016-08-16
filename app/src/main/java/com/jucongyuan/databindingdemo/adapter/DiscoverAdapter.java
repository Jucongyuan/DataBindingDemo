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
import com.jucongyuan.databindingdemo.databinding.ItemDiscoverForwardingBinding;
import com.jucongyuan.databindingdemo.models.Share;

import java.util.ArrayList;

/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 7/6/16 5:11 PM
 */
public class DiscoverAdapter extends RecyclerView.Adapter<DiscoverAdapter.ViewHolder> {

    private ArrayList<Share> shares = new ArrayList<>();


    public DiscoverAdapter(ArrayList<Share> shares) {
        this.shares.addAll(shares);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemDiscoverForwardingBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_discover_forwarding, parent, false);
        ViewHolder holder = new ViewHolder(binding.getRoot());
        holder.setBinding(binding);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Share share = shares.get(position);
        holder.getBinding().setVariable(BR.share, share);
        holder.getBinding().executePendingBindings();

        if (share.getType() == Share.Type.FORWARDING.getType()) {
            ItemDiscoverForwardingBinding binding = (ItemDiscoverForwardingBinding) holder.getBinding();
            binding.title.sdvAvatar.setImageURI(Uri.parse(share.getAvatar()));
            binding.sdvImage.setImageURI(Uri.parse(share.getForwarding().getImgages().get(0)));
        }
    }


    @Override
    public int getItemViewType(int position) {
        return shares.get(position).getType();
    }

    @Override
    public int getItemCount() {
        return shares.size();
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
