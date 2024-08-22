package com.yokeh.employee.Entity;

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
