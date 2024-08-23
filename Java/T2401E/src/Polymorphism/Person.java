package Polymorphism;

public abstract class Person {
    public String name;
    public String email;
    public String numberPhone;


    public Person(String name, String email, String numberPhone) {
        this.name = name;
        this.email = email;
        this.numberPhone = numberPhone;
    }

    public abstract double getSalary();


}
