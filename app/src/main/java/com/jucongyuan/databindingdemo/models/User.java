package com.jucongyuan.databindingdemo.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import com.jucongyuan.databindingdemo.BR;

/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 7/11/16 5:08 PM
 */
public class User extends BaseObservable {

    private String status;
    private String avatar;
    private String nikeName;
    private String sex;
    private boolean isAuthenticate;
    private String title;
    private String address;
    private int fansNum;
    private int browseNum;
    private String income;


    @Bindable
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyPropertyChanged(BR.status);
    }

    @Bindable
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
        notifyPropertyChanged(BR.avatar);
    }

    @Bindable
    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
        notifyPropertyChanged(BR.nikeName);
    }

    @Bindable
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
        notifyPropertyChanged(BR.sex);
    }

    @Bindable
    public boolean isAuthenticate() {
        return isAuthenticate;
    }

    public void setAuthenticate(boolean authenticate) {
        isAuthenticate = authenticate;
        notifyPropertyChanged(BR.authenticate);
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }

    @Bindable
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        notifyPropertyChanged(BR.address);
    }

    @Bindable
    public int getFansNum() {
        return fansNum;
    }

    public void setFansNum(int fansNum) {
        this.fansNum = fansNum;
        notifyPropertyChanged(BR.fansNum);
    }

    @Bindable
    public int getBrowseNum() {
        return browseNum;
    }

    public void setBrowseNum(int browseNum) {
        this.browseNum = browseNum;
        notifyPropertyChanged(BR.browseNum);
    }

    @Bindable
    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
        notifyPropertyChanged(BR.income);
    }
}
