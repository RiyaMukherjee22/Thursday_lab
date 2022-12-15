/*write a program to calculate gross salary of an employee. Basic salary should be taken from user.
If basic salary is grater that 1500 ,HRA=20% and DA=90% will be given else HRA=500 and DA 70% given to the employee.
 */


package oops;
import java.util.*;
public class Employee {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the basic salary: ");
		int bs = sc.nextInt();
		float hra,da;
		if(bs>1500) {
			hra=bs*0.2f;
			da=bs*0.9f;
		}
		else {
			hra=bs+500;
			da=bs*0.7f;
		}
		System.out.println("Gross salary: "+(bs+hra+da));

	}

}
