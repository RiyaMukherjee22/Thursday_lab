//wap to calculate bonus.if employee is serving  in organization for more than 3years, * bonus =2500 will be given to employee.

package oops;
import java.util.*;

public class Bonus {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the current year: ");
		int current_year= sc.nextInt();
		System.out.println("Enter the year of joining: ");
		int join_year= sc.nextInt();
		int diff= current_year-join_year;
		if(diff>3)
		{
			System.out.println("Bonus of rs: 2500/");
		}
		else
		{
			System.out.println("No bonus.");
		}

	}

}
