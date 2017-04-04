package com.siva.poc.model;

/**
 * Created by e056441 on 3/22/2017.
 */
public class PersonToCheck {

    public String name;

    public int age;

    public PersonToCheck() {
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

    @Override
    public String toString() {
        return "PersonToCheck{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}