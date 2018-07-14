package com.example.ero.week3homework1;

import java.util.List;

public class MessengeModel {

    private String nameMessenge;
    private String imageMessenge;
    private boolean itsMy;
    private String massage;
    private List<String> chatList;

    public MessengeModel(String nameMessenge, String massage, boolean itsMy) {
        this.nameMessenge = nameMessenge;
        this.massage = massage;
        this.itsMy = itsMy;
    }

    public MessengeModel(String nameMessenge, String massage, String imageMessenge, boolean itsMy) {
        this.nameMessenge = nameMessenge;
        this.imageMessenge = imageMessenge;
        this.massage = massage;
        this.itsMy = itsMy;
    }

    public String getNameMessenge() {
        return nameMessenge;
    }

    public void setNameMessenge(String nameMessenge) {
        this.nameMessenge = nameMessenge;
    }

    public String getImageMessenge() {
        return imageMessenge;
    }

    public void setImageMessenge(String imageMessenge) {
        this.imageMessenge = imageMessenge;
    }

    public boolean isItsMy() {
        return itsMy;
    }

    public void setItsMy(boolean itsMy) {
        this.itsMy = itsMy;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public List<String> getChatList() {
        return chatList;
    }

    public void setChatList(List<String> chatList) {
        this.chatList = chatList;
    }
}

