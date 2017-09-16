import java.util.*;

public class SortingAsec {
    public static void main(String args[])throws Exception{
	   ArrayList <String> arr=new ArrayList();
	     Scanner sc=new Scanner(System.in);
	 
	   System.out.println("Enter the number of names in the  List::");
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++){
		 System.out.println("Enter name"+(i+1));
		 String s=sc.next();
		 arr.add(s);
	 }
	 Collections.sort(arr);
	 Thread.sleep(1000);
	 Iterator p=arr.iterator();
	 
	 System.out.println("The final List after sorting is::");
	 while(p.hasNext()){ // checks if there exist a next element in the list
		System.out.println(p.next()); // if exist then print the next element
		Thread.sleep(50);
	 }
		 
 }
}
