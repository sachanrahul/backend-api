package com.myadvocate.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.validation.OneOf;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;
import java.util.Date;
import java.util.PriorityQueue;

/**
 * Created by rahul.sachan on 17/12/15.
 */
public class Client implements Serializable {

    @NotEmpty
    private int profile_id;
    private String name;
    private float age;
    private float experience;
    private String address;
    private String city;
    private String state;
    private String image;
    private String email;
    private String  office_add;
    @NotEmpty
    @OneOf(value = {"m", "f"}, ignoreCase = true, ignoreWhitespace = true)
    private String gender;
    private Date dob;
    private String contact_no;

    private Client(){}

    public Client(int profile_id,String name,float age,float experience, String address,String city, String state, String image,
                  String office_add,String contact_no,String email,Date dob,String gender ) {
        this.profile_id = profile_id;
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.address = address;
        this.city = city;
        this.state = state;
        this.image =image;
        this.email = email;
        this.gender = gender;
        this.contact_no = contact_no;
        this.dob = dob;
        this.office_add = office_add;
    }


    @JsonProperty
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty
    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    @JsonProperty
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public float getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOffice_add() {
        return office_add;
    }

    public void setOffice_add(String office_add) {
        this.office_add = office_add;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public int getProfileId() {
        return profile_id;
    }

    public void setProfileId(int profile_id) {
        this.profile_id = profile_id;
    }
}
