package com.yokeh.hotel.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String surname;
    private String secondName;
    private String phoneNumber;

    public Employee(String firstName, String surname, String secondName, String phoneNumber){
        this.firstName = firstName;
        this.surname = surname;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
    }

    protected Employee() {

    }

    public String toString(){
        return String.format(
                "Employee[id=%d, firstName='%s', surname='%s', secondName='%s',phoneNumber='%s']",
                id, firstName, surname, secondName, phoneNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
