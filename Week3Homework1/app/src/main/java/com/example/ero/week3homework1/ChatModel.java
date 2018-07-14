package com.example.ero.week3homework1;

public class ChatModel {
    private String nameSurname;
    private String status;
    private String imageChatId;

    public ChatModel(String nameSurname, String status, String imageChatId) {
        this.nameSurname = nameSurname;
        this.status = status;
        this.imageChatId = imageChatId;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImageChatId() {
        return imageChatId;
    }

    public void setImageChatId(String imageChatId) {
        this.imageChatId = imageChatId;
    }
}
