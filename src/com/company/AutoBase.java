package com.company;

public class AutoBase {
    private int id;
    private String name;
    private String drive;
    private String state;

    public AutoBase(){


    }

    public AutoBase(int id, String name, String drive, String state) {
        this.id = id;
        this.name = name;
        this.drive = drive;
        this.state = state;
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

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}