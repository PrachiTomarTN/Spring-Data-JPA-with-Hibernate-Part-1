package com.example.JPAproject.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    private int ID;
    private String name;
    private String location;
    private int age;

    public Employee(){

    }

    public Employee(int ID, String name, String location, int age) {
      this.ID = ID;
        this.name = name;
        this.location = location;
       this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                '}';
    }
}
