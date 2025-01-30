package com.practice.appone.models;


public class Student {

    private int id;
    private String firstName;

    private String LastName;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.LastName = lastName;
    }



}
