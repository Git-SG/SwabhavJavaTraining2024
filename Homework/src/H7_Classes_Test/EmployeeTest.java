package H7_Classes_Test;

import java.util.Scanner;

import H7_Classes_model.Employee;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		System.out.println("Enter deatils for employee 1");
		System.out.println("Enter Employee ID: ");
		int employeeId1 = scanner.nextInt();
		scanner.nextLine();
//		employee1.setEmployeeId(employeeId1);
		
		System.out.println("Enter Employee name: ");
		String name1 = scanner.nextLine();
//		employee1.setName(name1);
		
		System.out.println("Enter Salary: ");
		int salary1 = scanner.nextInt();
//		employee1.setSalary(salary1);
		
		Employee employee1 = new Employee(employeeId1, name1, salary1);
		
		System.out.println("Enter deatils for employee 2");
		System.out.println("Enter Employee ID: ");
		int employeeId2 = scanner.nextInt();
		scanner.nextLine();
//		employee2.setEmployeeId(employeeId2);
		
		System.out.println("Enter Employee name: ");
		String name2 = scanner.nextLine();
//		employee2.setName(name2);
		
		System.out.println("Enter Salary: ");
		int salary2 = scanner.nextInt();
//		employee2.setSalary(salary2);
		
		Employee employee2 = new Employee(employeeId2, name2, salary2);

		System.out.println("EMPLOYEE 1");
		System.out.println("Employee ID: " + employee1.getEmployeeId());
		System.out.println("Employee name: " + employee1.getName());
		System.out.println("Salary: " + employee1.getSalary());
		
		System.out.println("\nEMPLOYEE 2");
		System.out.println("Employee ID: " + employee2.getEmployeeId());
		System.out.println("Employee name: " + employee2.getName());
		System.out.println("Salary: " + employee2.getSalary());
	}

}
