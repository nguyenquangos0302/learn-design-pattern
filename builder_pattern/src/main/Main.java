package main;

import model.Person;

public class Main {

    public static void main(String[] args) {
        Person person = new Person.PersonBuilder().name("Quang").email("quangntn0302@gmail.com").build();
        System.out.println(person.toString());
    }

}
