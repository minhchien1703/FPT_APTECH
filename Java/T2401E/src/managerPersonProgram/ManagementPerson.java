package managerPersonProgram;

/**
 * @author Student Name
 * @version 1.0
 */
public class ManagementPerson {
    private static String
            SALARY_NOT_THAN_ZERO = "Salary is greate Than Zero",
            INPUT_SALARY = "You must input salary",
            INPUT_DIGIDT = "You must input digidt";

    /**
     * This is method used to input information of Person
     * 
     * @param name
     *            of Person
     * @param address
     *            of Person
     * @param sSalary
     *            of Person
     * @return person
     * @throws Exception "Salary is greater than zero"
     *                   "You must input Salary."
     *                   "You must input digit.
     */
    public Person inputPersonInfo(String name, String address, String sSalary)
            throws Exception {
        double dSalary;
        try {
            if (sSalary != null && !sSalary.isEmpty()) {
                dSalary = Double.parseDouble(sSalary);
                if (dSalary > 0) {
                    new Person(name, address, dSalary);
                } else {
                    System.out.println(SALARY_NOT_THAN_ZERO);
                }
            } else {
                System.out.println(INPUT_SALARY);
            }
        } catch (Exception e) {
            System.out.println(INPUT_DIGIDT);
        }

        return null;
    }

    /**
     * This is method used to display information of Person you have entered.
     * 
     * @param person
     *            Object
     */
    public void displayPersonInfo(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Salary: " + person.getSalary());
    }

    /**
     * This is method used to sort Person entered by gradually increased of
     * Salary.
     * 
     * @param persons
     *            of Array Person
     * @return Person Object
     * @throws Exception "Can't Sort Person" 
     */
    public Person[] sortBySalary(Person[] persons) throws Exception {
        // Student write code here
        return null;
    }
}
