package com.appify.emmasproject.model;

public class Student {
    private String name;
    private String id;
    private String url;
    private boolean isExco;
    private String level;
    private String favQuote;
    private String phoneNo;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isExco() {
        return isExco;
    }

    public void setExco(boolean exco) {
        isExco = exco;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getFavQuote() {
        return favQuote;
    }

    public void setFavQuote(String favQuote) {
        this.favQuote = favQuote;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
