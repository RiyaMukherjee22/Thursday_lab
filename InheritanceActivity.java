package inheritance;
class Employee{
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance=250.80;
	double Hra=1000.50;
	
	Employee(long employeeId,String employeeName,String employeeAddress,long employeePhone){ //Overloaded constructor defined
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeAddress=employeeAddress;
		this.employeePhone=employeePhone;
	}
	
	public void calculateSalary() { //Salary variable defined and calculated based on the basic salary.
		double salary = basicSalary+(basicSalary * specialAllowance/100)+(basicSalary * Hra/100);
		System.out.println("The salary is "+ salary);
	}
	
	public void calculateTransportAllowance() { //transportAllowance is defined and calculated using basic salary.
		double transportAllowance = (basicSalary * 10)/100;
		System.out.println("The transport allowance is "+transportAllowance);
	}
	
	
	
	
}

class Manager extends Employee{  //Class Manager is inheriting class Employee having all the variables and the methods that are declared in class Employee
	Manager(long employeeId,String employeeName,String employeeAddress,long employeePhone, double basicSalary){  //Constructor is overloaded
		super(employeeId, employeeName, employeeAddress, employeePhone); //to call employee class's constructor use 'this' keyword
		this.basicSalary = basicSalary;
	}
	
	public void calculateTransportAllowance() {  //Method is overloaded 
		double transportAllowance = (basicSalary * 15)/100;  
		System.out.println("The transport allowance is "+transportAllowance);
	}
	
}

class Trainee extends Employee{  //Class Trainee is inheriting class Employee having all the variables and the methods that are declared in class Employee
	Trainee(long employeeId,String employeeName,String employeeAddress,long employeePhone,double basicSalary){
		super(employeeId, employeeName, employeeAddress, employeePhone);
		this.basicSalary = basicSalary;
	}
}


public class InheritanceActivity {
	public static void main(String[] args) {
		Manager m1 = new Manager(126534,"Peter","Chennai India",237844,65000);  //instance of Manager is created and values are passed. 
        m1.calculateSalary();
        m1.calculateTransportAllowance();

        Trainee t1 = new Trainee(29846,"Jack","Mumbai India",442085,45000);  //instance of Trainee is created and values are passed. 
        t1.calculateSalary();
        t1.calculateTransportAllowance();
    }
}
