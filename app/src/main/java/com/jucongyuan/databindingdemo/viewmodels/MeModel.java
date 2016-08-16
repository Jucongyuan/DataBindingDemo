package com.jucongyuan.databindingdemo.viewmodels;

import android.net.Uri;

import com.facebook.drawee.view.SimpleDraweeView;
import com.jucongyuan.databindingdemo.fragment.MeFragment;
import com.jucongyuan.databindingdemo.models.User;

/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 7/6/16 2:16 PM
 */
public class MeModel {

    public User user;

    private MeFragment meFragment;

    public MeModel(MeFragment meFragment, SimpleDraweeView sdvAavtar) {
        this.meFragment = meFragment;
        user = new User();
        user.setAvatar("http://img3.imgtn.bdimg.com/it/u=1033649457,1987438146&fm=21&gp=0.jpg");
        user.setNikeName("昵称");
        user.setAuthenticate(true);
        user.setIncome("2020");
        user.setFansNum(542123);
        user.setBrowseNum(1452151);
        user.setAddress("四川>成都市>高新区");
        sdvAavtar.setImageURI(Uri.parse(user.getAvatar()));
    }


    public void logoutClick() {
       
    }


}
