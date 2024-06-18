package com.principles.singleton;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public void connect(){
        System.out.println("Database connect success");
    }

    public void disconnect(){
        System.out.println("Database disconnect success");
    }

}

class PersonService{
    public List<Person> getPersons(){
        return new ArrayList<>(List.of(new Person("Ömer","Altan"), new Person("Elif", "Altan")));
    }
}

class Person{

    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
