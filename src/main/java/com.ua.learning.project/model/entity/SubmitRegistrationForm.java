package com.ua.learning.project.model.entity;

import com.google.common.hash.HashCode;

import java.util.Objects;

public class SubmitRegistrationForm {

    private String firstName;
    private String lastName;
    private String birthday;
    private int age;

    @Override
    public String toString() {
        return "SubmitRegistrationForm{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubmitRegistrationForm that = (SubmitRegistrationForm) o;
        return age == that.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SubmitRegistrationForm() {
    }

    public SubmitRegistrationForm(String firstName, String lastName, String birthday, int age) {

    }


}
