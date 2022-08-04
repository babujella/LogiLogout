package com.tech.SpringDependencyInjection;

public class Student {
	private String StudentName;
	private int StudentRollNo;
	private String Branch;
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public void setStudentRollNo(int studentRollNo) {
		StudentRollNo = studentRollNo;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public void displayStudentData() {
		System.out.println("StudentName is :"+StudentName);
		System.out.println("StudentRollNo is "+StudentRollNo);
		System.out.println("StudentBranch is "+Branch);
		System.out.println();
	}
}
