package com.kay.junit5.domain;

import java.time.LocalDate;

/**
 * Person
 * @author kay
 * @date 2019/08/27
 */
public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate dateOfBirth;


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, Gender gender, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
