package com.myadvocate.model;

import java.io.Serializable;
import java.util.PriorityQueue;

/**
 * Created by rahul.sachan on 17/12/15.
 */
public class Client implements Serializable {
    private String fName;
    private String mName;
    private String lName;
    private int age;
    private float experience;
    private String address;

    private Client(){}
    public Client(String fName, String mName, String lName, int age, float experience, String address) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.age = age;
        this.experience = experience;
        this.address = address;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
