package com.example.androiddayfour;

public class Student {
    private int sid;
    private  String name;
    public Student(int sid,String name) {
        this.sid = sid;
        this.name = name;
    }
    public int getId() {
        return this.sid;
    }
    public String getName() {
        return this.name;
    }
    public void setId(int sid) {
        this.sid = sid;
    }
    public void setName(String name) {
        this.name = name;
    }
}
