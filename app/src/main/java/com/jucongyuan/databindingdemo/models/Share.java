package com.jucongyuan.databindingdemo.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import java.util.List;

/**
 * 描述
 *
 * @author Jucongyuan
 * @Time 7/7/16 2:35 PM
 */
public class Share extends BaseObservable {


    public enum Type {

        FORWARDING(1), IMAGES(2), IMAGE_ONE(3), IMAGE_TWO(4), IMAGE_FOUR(5), TEXT(6), IMAGE_TEXT(7);

        int type;

        Type(int type) {
            this.type = type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getType() {
            return type;
        }
    }


    private String id;
    private String avatar;
    private String author;
    private String date;
    private String title;
    private String content;
    private int readNumber;
    private int thumbsUpNumber;
    private List<Reviewer> reviewers;
    private List<String> imgages;
    private Share forwarding;
    private int type;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Bindable
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Bindable
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Bindable
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Bindable
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Bindable
    public int getReadNumber() {
        return readNumber;
    }

    public void setReadNumber(int readNumber) {
        this.readNumber = readNumber;
    }

    @Bindable
    public int getThumbsUpNumber() {
        return thumbsUpNumber;
    }

    public void setThumbsUpNumber(int thumbsUpNumber) {
        this.thumbsUpNumber = thumbsUpNumber;
    }

    @Bindable
    public List<Reviewer> getReviewers() {
        return reviewers;
    }

    public void setReviewers(List<Reviewer> reviewers) {
        this.reviewers = reviewers;
    }

    @Bindable
    public List<String> getImgages() {
        return imgages;
    }

    public void setImgages(List<String> imgages) {
        this.imgages = imgages;
    }

    @Bindable
    public Share getForwarding() {
        return forwarding;
    }

    public void setForwarding(Share forwarding) {
        this.forwarding = forwarding;
    }


    @Bindable
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
