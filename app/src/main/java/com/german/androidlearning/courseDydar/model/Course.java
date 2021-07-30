package com.german.androidlearning.courseDydar.model;

public class Course {

    int id,category;
    String img, title, date, level, color, text;

    public Course(int id, String img, String title, String date, String level, String color, String text,int category) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.date = date;
        this.level = level;
        this.color = color;
        this.text = text;
        this.category = category;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getImg() {
        return img;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getLevel() {
        return level;
    }

    public String getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
