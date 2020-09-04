package com.example.whatsappclone.Chat;

import com.example.whatsappclone.User.UserObjects;

import java.io.Serializable;
import java.util.ArrayList;

public class ChatObject implements Serializable {
    private String chatId;

    private ArrayList<UserObjects> userObjectsArrayList = new ArrayList<>();

    public ChatObject(String chatId) { this.chatId = chatId; }

    public String getChatId() { return chatId; }
    public ArrayList<UserObjects> getUserObjectsArrayList() { return userObjectsArrayList; }

    public void addUserToArrayList(UserObjects mUser){
        userObjectsArrayList.add(mUser);
    }
}
