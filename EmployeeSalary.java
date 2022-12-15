package oops;
import java.util.*;

public class EmployeeSalary {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1();
		e1.setData(1, "riya", 25000, "manager", 2);
		System.out.println(e1.getempId()+"\n"+e1.getempName()+"\n"+e1.getbasicSalary()+"\n"+e1.getempdesignation()+"\n"+e1.getservedYear());
		e1.getAppraisal();
		e1.calculateTA();
	}
}

class Employee1 {
	int empId;
	String empName;
	long basicSalary;
	String empdesignation;
	int servedYear;
	
	
	
	public void setData(int Id,String Name,long Salary,String Designation,int servedYear) {
		this.empId=Id;
		this.empName=Name;
		this.basicSalary=Salary;
		this.empdesignation=Designation;
		this.servedYear = servedYear;
	}
	
	public int getempId() {
		return empId;
	}
	public String getempName() {
		return empName;
	}
	public long getbasicSalary() {
		return basicSalary;
	}
	public String getempdesignation() {
		return empdesignation;
	}
	public int getservedYear() {
		return servedYear;
	}
	
	
	public void getAppraisal() {
		if(servedYear == 1) {
			basicSalary = basicSalary + ((basicSalary *10)/100);
		}
		System.out.println("The increment is "+basicSalary);
	}
	public void calculateTA() {
		if(empdesignation.equals("manager")) {
			System.out.println("The travel allowance is "+ 3000);
		}
		else {
			System.out.println("The travel allowance is "+ 1000);
		}
		
	}
}
