package com.domain;

public class Student {
    private int id;
    private String  name;
    private String password;
    private int gender;
    private String grate;

    public Student() {
    }

    public Student(int id, String name, String password, int gender, String grate) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.grate = grate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getGrate() {
        return grate;
    }

    public void setGrate(String grate) {
        this.grate = grate;
    }
}
