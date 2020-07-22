package com.example.newsapp;

public class News {
    private String mTitle;
    private String mDate;
    private String mUrl;
    private String mType;
    private String mSection;

    public News(String title, String date, String url, String type, String section) {
        mTitle = title;
        mDate = date;
        mUrl = url;
        mType = type;
        mSection = section;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getType() {
        return mType;
    }

    public String getSection() {
        return mSection;
    }

    public String getDate() {
        return mDate;
    }

    @Override
    public String toString() {
        return " title " + getTitle();

    }
}