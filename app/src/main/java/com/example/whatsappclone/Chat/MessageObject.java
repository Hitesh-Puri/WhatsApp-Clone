package com.example.whatsappclone.Chat;

import java.util.ArrayList;

public class MessageObject {
    String messageId, message, senderId;
    ArrayList<String> mediaUrlList;

    public MessageObject(String messageId, String senderId, String message,ArrayList<String> mediaUrlList) {
        this.message = message;
        this.messageId = messageId;
        this.senderId = senderId;
        this.mediaUrlList = mediaUrlList;
    }

    public String getMessageId() { return messageId; }
    public String getSenderId() { return senderId; }
    public String getMessage() { return message; }
    public ArrayList<String> getMediaUrlList() { return mediaUrlList; }
}
