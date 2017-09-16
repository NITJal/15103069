
import java.util.*;
import java.lang.*;
public class Calculator implements calci{
	public int sum(int a,int b)
    {
  	  return a+b;
    }
    public int subtract(int a,int b)
    {
  	  return a-b;
    }
    public int divide(int a,int b)
    {
  		  return a/b;
    }
    public int multiply(int a,int b)
    {
  	  return a*b;
    }  
    public  int minimum(int a, int b){
    	return((a<b)?a:b);
    }
    public  int maximum(int a, int b){
    	return((a>b)?a:b);
    }
    public double cosine(double a){
      double c=Math.cos(a);
      return c;
    }
    public double sine(double a){
        double c=Math.sin(a);
        return c;
      }
    public double Square(double a){
    	double d=Math.pow(a, 2);
    	return d;
    }
    
	public static void main(String args[]) throws Exception
      {
		Calculator obj=new Calculator();
    	 Scanner sc=new Scanner(System.in);
    	// String ch="y";
    	 while(true){
    	 System.out.print("1.add\n2.subtract\n3.multiply\n4.divide\n5.Maximum\n6.Minimum\n7.Cosine\n8.sine\n9.Square\n10.Exit\n");
    	 int n=sc.nextInt();
    	 int a,b;
    	 double c,d;
    	 
    	 switch(n)
    	 {
    	 case 1:
    		 System.out.println("enter the numbers");
    		 a=sc.nextInt();
    		 b=sc.nextInt();
    		 System.out.println("Ans::"+obj.sum(a, b));break;
    	 case 2:
    		 System.out.println("enter the numbers");
    		 a=sc.nextInt();
    		 b=sc.nextInt();
    		 System.out.println("Ans::"+obj.subtract(a, b));break;
    	 case 3:
    		 System.out.println("enter the numbers");
    		 a=sc.nextInt();
    		 b=sc.nextInt();
    		 System.out.println("Ans::"+obj.multiply(a, b));break;
    	 case 4:
    		 System.out.println("enter the numbers");
    		 a=sc.nextInt();
    		 b=sc.nextInt();
    		 try{
    		 System.out.println("Ans::"+obj.divide(a, b));break;
    		 }
    		 catch(Exception e)
    		 {
    			 System.out.println("it gives infinity");
    		 }
    	 case 5: 
    		 System.out.println("enter the numbers");
    		 a=sc.nextInt();
    		 b=sc.nextInt();
    		 System.out.println("Ans::"+obj.maximum(a, b));break;
    	 case 6:
    		 System.out.println("enter the numbers");
    		 a=sc.nextInt();
    		 b=sc.nextInt();
    		 System.out.println("Ans::"+obj.minimum(a, b));break;
    	 case 7:
    		 System.out.println("enter the number");
    		 c=sc.nextDouble();
    		 System.out.println("Ans::"+obj.cosine(c));break;
    	 case 8:
    		 System.out.println("enter a number");
    		 d=sc.nextDouble();
    		 System.out.println("Ans::"+obj.sine(d));break;
    	 case 9: System.out.println("enter a number");
		         d=sc.nextDouble();
		          System.out.println("Ans::"+obj.Square(d));break;
    	 case 10:System.exit(0);
    	        break;
    	 default:
    		   break;
    	 }
    	Thread.sleep(2000);
      }
      
}
}
