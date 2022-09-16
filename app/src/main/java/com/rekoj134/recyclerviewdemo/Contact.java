package com.rekoj134.recyclerviewdemo;

public class Contact {
    private String name;
    private String phoneNumber;
    private boolean img;

    public Contact(String name, String phoneNumber, boolean img) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isImg() {
        return img;
    }

    public void setImg(boolean img) {
        this.img = img;
    }
}
