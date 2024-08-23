package Polymorphism;

public class Emp extends Person {
    public double salary;

    public Emp (String name, String email, String numberPhone, double salary) {
        super(name, email, numberPhone);
        this.salary = salary;
    }

    public double getSalary() {
        return 2 * this.salary;
    }
}
