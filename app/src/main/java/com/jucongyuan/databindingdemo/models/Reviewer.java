package com.jucongyuan.databindingdemo.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 7/7/16 2:43 PM
 */

public class Reviewer extends BaseObservable {

    private String id;
    private String name;
    private String content;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bindable
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
