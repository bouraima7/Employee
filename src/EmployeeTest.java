import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first name of the first employee: ");
		String firstName1 = scanner.nextLine();

		System.out.print("Enter the last name of the first employee: ");
		String lastName1 = scanner.nextLine();

		System.out.print("Enter the monthly salary of the first employee: ");
		double monthlySalary1 = scanner.nextDouble();
		while (monthlySalary1 <= 0){ //input validation for the salary > 0
			System.out.println("Make sure to input a positive value: ");
			monthlySalary1 = scanner.nextDouble();
		}

		scanner.nextLine(); // Clear the input buffer

		System.out.print("Enter the first name of the second employee: ");
		String firstName2 = scanner.nextLine();

		System.out.print("Enter the last name of the second employee: ");
		String lastName2 = scanner.nextLine();

		System.out.print("Enter the monthly salary of the second employee: ");
		double monthlySalary2 = scanner.nextDouble();
		while (monthlySalary2 <= 0){ //input validation for the salary > 0
			System.out.println("Make sure to input a positive value: ");
			monthlySalary2 = scanner.nextDouble();
		}

		scanner.close(); // Close the scanner

		// Create Employee objects
		Employee employee1 = new Employee(firstName1, lastName1, monthlySalary1);
		Employee employee2 = new Employee(firstName2, lastName2, monthlySalary2);

		// Display employee information
		System.out.println("\nEmployee 1:");
		System.out.println("First Name: " + employee1.getFirstName());
		System.out.println("Last Name: " + employee1.getLastName());
		System.out.println("Monthly Salary: " + employee1.getMonthlySalary());

		System.out.println("\nEmployee 2:");
		System.out.println("First Name: " + employee2.getFirstName());
		System.out.println("Last Name: " + employee2.getLastName());
		System.out.println("Monthly Salary: " + employee2.getMonthlySalary());
	}
}
