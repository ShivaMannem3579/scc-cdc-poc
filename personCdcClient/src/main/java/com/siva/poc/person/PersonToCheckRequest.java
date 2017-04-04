package com.siva.poc.person;

/**
 * Created by e056441 on 3/22/2017.
 */
public class PersonToCheckRequest {

    public String name;

    public int age;

    public PersonToCheckRequest(Person person) {
        this.name = person.getName();
        this.age = person.getAge();
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
}