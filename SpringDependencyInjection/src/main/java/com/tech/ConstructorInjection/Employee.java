package com.tech.ConstructorInjection;

public class Employee {
	private String EmployeeName;
	private int EmployeeId;
	private String EmployeeRole;
	
	public Employee(String employeeName, int employeeId, String employeeRole) {
		EmployeeName = employeeName;
		EmployeeId = employeeId;
		EmployeeRole = employeeRole;
	}
	public void displayEmployeeData() {
		System.out.println("Employeename :"+EmployeeName);
		System.out.println("EployeeId :"+ EmployeeId);
		System.out.println("EmployeeRole :"+EmployeeRole);
		System.out.println();
	}
}
