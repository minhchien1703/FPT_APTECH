package Polymorphism;

public class Manager extends Person {
    public double salary;

    public Manager(String name, String email, String numberPhone, double salary) {
        super(name, email, numberPhone);
        this.salary = salary;
    }

    public double getSalary() {
        return  3 * this.salary;
    }

}
