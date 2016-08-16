package com.jucongyuan.databindingdemo.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import java.io.Serializable;

/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 6/28/16 2:19 PM
 */
public class Answerer extends BaseObservable implements Serializable {


    private String status;
    private String avatar;
    private String nikeName;
    private String sex;
    private boolean isAuthenticate;
    private String title;
    private String address;
    private int fansNum;
    private int browseNum;
    private int serviceNum;
    private String price;
    private String service;

    public Answerer(String status, String avatar, String nikeName, String sex, boolean isAuthenticate, String title, String address, int fansNum, int browseNum) {
        this.status = status;
        this.avatar = avatar;
        this.nikeName = nikeName;
        this.sex = sex;
        this.isAuthenticate = isAuthenticate;
        this.title = title;
        this.address = address;
        this.fansNum = fansNum;
        this.browseNum = browseNum;
    }

    @Bindable
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyPropertyChanged(com.jucongyuan.databindingdemo.BR.status);
    }

    @Bindable
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
        notifyPropertyChanged(com.jucongyuan.databindingdemo.BR.avatar);
    }

    @Bindable
    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
        notifyPropertyChanged(com.jucongyuan.databindingdemo.BR.nikeName);
    }

    @Bindable
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
        notifyPropertyChanged(com.jucongyuan.databindingdemo.BR.sex);
    }

    @Bindable
    public boolean isAuthenticate() {
        return isAuthenticate;
    }

    public void setAuthenticate(boolean authenticate) {
        isAuthenticate = authenticate;
        notifyPropertyChanged(com.jucongyuan.databindingdemo.BR.authenticate);
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(com.jucongyuan.databindingdemo.BR.title);
    }

    @Bindable
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        notifyPropertyChanged(com.jucongyuan.databindingdemo.BR.address);
    }

    @Bindable
    public int getFansNum() {
        return fansNum;
    }

    public void setFansNum(int fansNum) {
        this.fansNum = fansNum;
        notifyPropertyChanged(com.jucongyuan.databindingdemo.BR.fansNum);
    }

    @Bindable
    public int getBrowseNum() {
        return browseNum;
    }

    public void setBrowseNum(int browseNum) {
        this.browseNum = browseNum;
        notifyPropertyChanged(com.jucongyuan.databindingdemo.BR.browseNum);
    }

    @Bindable
    public int getServiceNum() {
        return serviceNum;
    }

    public void setServiceNum(int serviceNum) {
        this.serviceNum = serviceNum;
        notifyPropertyChanged(com.jucongyuan.databindingdemo.BR.serviceNum);
    }

    @Bindable
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
        notifyPropertyChanged(com.jucongyuan.databindingdemo.BR.price);
    }

    @Bindable
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
        notifyPropertyChanged(com.jucongyuan.databindingdemo.BR.service);
    }
}
