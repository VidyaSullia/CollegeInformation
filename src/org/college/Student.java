package org.college;

public class Student extends College {
	public void studentName() {
		System.out.println("Name: Vidya");
	}

	public void studentDept() {
		System.out.println("Dept: IT");
	}

	public void studentId() {
		System.out.println("Id: 1234567");

	}

	public static void main(String[] args) {
		Student S = new Student();
		S.studentName();
		S.studentDept();
		S.studentId();
		S.collegeName();
		S.collegeCode();
		S.collegeRank();
		S.hostelName();
		S.deptName();
	}

}
