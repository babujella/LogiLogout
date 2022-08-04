package com.tech.DependencyObject;

public class Employee {
	private String EmployeeName;
	private int EmployeeId;
	private Address address;
	
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [EmployeeName=" + EmployeeName + ", EmployeeId=" + EmployeeId + ", address=" + address + "]";
	}
}
