package com.hafiizh.androidmvvmintegration.model;

/**
 * Created by HAFIIZH on 10/8/2017.
 */

public class User {
    public String firstName;
    public String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
