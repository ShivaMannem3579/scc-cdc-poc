package com.siva.poc.person;

/**
 * Created by e056441 on 3/22/2017.
 */
public class PersonToCheckRequestV1 {

    public String name;

    public int age;

    public String driversLicense;

    public PersonToCheckRequestV1(PersonV1 personV1) {
        this.name = personV1.getName();
        this.age = personV1.getAge();
        this.driversLicense = personV1.getDriversLicense();
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