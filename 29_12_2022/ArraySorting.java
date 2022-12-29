//Riya Mukherjee
// Sort the Array Elements

package array;
import java.util.Scanner;

public class ArraySorting {
	public static void sort(int arr[],int n)
	{
		int i,j,temp;
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j;
		int arr[]=new int[10];
		System.out.println("Enter the number of elements: ");
		
		int n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("after sorting");
		ArraySorting.sort(arr, n);//method calling

	}

}
