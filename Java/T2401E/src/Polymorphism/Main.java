package Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new  ArrayList();
        person.add( new Director("Rose", "Rose@gmail.com", "0213123021", 3000));
        person.add( new Manager("Perter", "peter@gmail.com", "313123213", 2000));
        person.add( new Emp("Duo", "duo@gmail", "43432132", 1000));

        double totalSalary = 0;
        for (Person item : person) {
            totalSalary += item.getSalary();
        }

        System.out.println(totalSalary);




    }
}
