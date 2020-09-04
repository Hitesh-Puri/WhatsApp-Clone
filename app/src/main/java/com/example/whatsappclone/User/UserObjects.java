package com.example.whatsappclone.User;

import java.io.Serializable;

public class UserObjects implements Serializable {
    private String name, phone, uid, notificationKey;

    private Boolean selected = false;

    public UserObjects(String uid) {
        this.uid = uid;
    }

    public UserObjects(String name, String phone, String uid) {
        this.name = name;
        this.phone = phone;
        this.uid = uid;
    }

    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public String getUid() { return uid; }

    public Boolean getSelected() {
        return selected;
    }

    public String getNotificationKey() { return notificationKey; }

    public void setName(String name) {
        this.name = name;
    }

    public void setNotificationKey(String notificationKey) { this.notificationKey = notificationKey; }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }
}
