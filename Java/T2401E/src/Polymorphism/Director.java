package Polymorphism;

public class Director extends Person {
    double salary;


    public  Director(String name, String email, String numberPhone, double salary) {
        super(name, email, numberPhone);
        this.salary = salary;
    }

    public double getSalary() {
        return 5 * this.salary;
    }

}
