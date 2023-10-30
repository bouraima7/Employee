public class Employee {
    private String firstName; // Instance variable to hold the employee's first name
    private String lastName; // Instance variable to hold the employee's last name
    private double monthlySalary; // Instance variable to hold the employee's monthly salary

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0; // Set monthly salary to 0.0 if it's not positive
        }
    }

    public String getFirstName() {
        return firstName; // Get the first name of the employee
    }

    public String getLastName() {
        return lastName; // Get the last name of the employee
    }

    public double getMonthlySalary() {
        return monthlySalary; // Get the monthly salary of the employee
    }
}


