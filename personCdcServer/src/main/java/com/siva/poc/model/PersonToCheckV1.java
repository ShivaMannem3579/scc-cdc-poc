package com.siva.poc.model;

/**
 * Created by e056441 on 3/22/2017.
 */
public class PersonToCheckV1 {

    public String name;

    public int age;

    public String driversLicense;

    public PersonToCheckV1() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(String driversLicense) {
        this.driversLicense = driversLicense;
    }

    @Override
    public String toString() {
        return "PersonToCheckV1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", driversLicense='" + driversLicense + '\'' +
                '}';
    }
}