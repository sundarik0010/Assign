package com.tute.classes;

public class EmployeeDetails {
	
	 
	 public void empName(String empName, int empId, String empAddress, double empSalary, double mobNum) {
		 System.out.println("Employee name:" +empName);
	 System.out.println("EmpId:" +empId);
	 System.out.println("EmpAddress:" +empAddress);
	 System.out.println("EmpSalary:" +empSalary);
	 System.out.println("MobileNum:" +mobNum);
	 }

public static void main(String[]args) {
	EmployeeDetails emp=new EmployeeDetails();
	emp.empName("munnnaa", 17, "chennai",88888,8668051105L );
}
}
	 
	 
	