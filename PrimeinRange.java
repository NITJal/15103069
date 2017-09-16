import java.util.*;
import java.lang.*;

public class PrimeinRange {
	public static boolean isPrime(int n){
		int flag=0;
		for(int i=2;i<n;i++){
			if(n%i==0){
				flag=1;
				break;
			}
		}
		if(flag==0){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for range::");
		int n;
		n=sc.nextInt();
		for(int i=2;i<=n;i++){
			if(isPrime(i)){
				System.out.println(i);
			}
		}
	}

}
