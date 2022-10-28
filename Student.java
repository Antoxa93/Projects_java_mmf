package com.new_package;
public class Student {
    int id;
    String surname;
    String name;
    String patronim;
    String birthDate;
    String address;
    String phoneNumber;
    String fac;
    int course;
    String group;
    Student(int id,String surname, String name, String middlename, String birthDate, String address, String phoneNumber,
            String fac, int course, String group){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronim = patronim;
        this.birthDate = birthDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.fac = fac;
        this.course = course;
        this.group = group;
    }

}

