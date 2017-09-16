import java.util.*;

public class PalindromeCheck {
 
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String::");
		String str=sc.next();
		
		int n=str.length();
		int i=0;int j=n-1;
		int flag=0;
		
		while(i<=j){
			if(str.charAt(i)==str.charAt(j)){
				i++;
				j--;
			}
			else{
				flag=1;
				break;
			}
		}
		if(flag==1){
			System.out.println("It is Not a Palindrome");
		}
		else{
			System.out.println("It is a Palindrome!!");
		}
	}
}
