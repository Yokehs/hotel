package com.yokeh.hotel.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee", schema = "hotel")
public class Employee {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer Id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "surname")
    private String surname;
    @Column(name = "secondname")
    private String secondName;
    @Column(name = "phonenumber")
    private String phoneNumber;

    public Employee(String firstName, String surname, String secondName, String phoneNumber){
        this.firstName = firstName;
        this.surname = surname;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
    }

    public Employee() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", secondName='" + secondName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
