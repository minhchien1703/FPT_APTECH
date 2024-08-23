package managerPersonProgram;

import java.util.Scanner;

public class Main {
    public static int lenght = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagementPerson manager = new ManagementPerson();
        Main main = new Main();
        String name, address, salary;
        System.out.println("=====Manager Person Program=====");
        try {
            for (int i = 0; i < lenght; i++) {
                System.out.println("Input information of Person:" + (i + 1));
                System.out.println("Input Name:");
                name = scanner.nextLine();
                System.out.println("Input Address:");
                address = scanner.nextLine();
                System.out.println("Input Salary:");
                salary = scanner.nextLine();
                manager.(name, address, salary);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }




s
    }
}
