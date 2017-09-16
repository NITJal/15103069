import java.util.Scanner;
public class Arraymultiply {

	public static void main(String args[])
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of array dimension");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr1[][]=new int[m][m];
		System.out.println("Enter the first array element");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the dimension of second array");
		
		int p =sc.nextInt();
		int q=sc.nextInt();
		
		if(n!=p)
		{
			System.out.println("Not possible to Multiply");
		}
		else
		{
			int arr2[][]=new int[p][q];
			int multiply[][]=new int[m][q];
		System.out.println("Enter the element of second array");
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<q;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<q;j++)
			{
				for(int k=0;k<p;k++)
				{
					sum=sum+arr1[i][k]*arr2[k][j];
				}
				multiply[i][j]=sum;
				sum=0;
			}
		}
		System.out.println("Product of entered matrices:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<q;j++)
			{
				System.out.println(multiply[i][j]+"\t");
			}
			System.out.println("\n");
		}
	  }
	}
}
