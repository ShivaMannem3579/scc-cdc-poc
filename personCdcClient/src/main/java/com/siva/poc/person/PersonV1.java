package com.siva.poc.person;

/**
 * Created by e056441 on 3/22/2017.
 */
public class PersonV1 {

    public String name;

    public int age;

    public String driversLicense;

    public PersonV1(String name, int age, String driversLicense) {
        this.name = name;
        this.age = age;
        this.driversLicense = driversLicense;
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
}