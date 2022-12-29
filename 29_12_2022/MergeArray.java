//Riya Mukherjee
//Merge two array

package array;

public class MergeArray {
	public static void main(String[] args) {
			int a[]= {1,2,3,4};
			int b[]= {5,6,7,8};
			int x=a.length,y=b.length;
			int z=x+y;//new index c,which help to add a and b
			int c[]=new int[z];//creating a new array c
			for(int i=0;i<x;i++)
			{
				c[i]=a[i];//merging a in c
			}
			for(int i=0;i<y;i++)
			{
				c[x+i]=b[i];
			}
			for(int i=0;i<z;i++)
			{
			System.out.print(c[i]+" ");
			}
		}
}
