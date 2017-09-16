import java.util.*;

 abstract class Shape{
	abstract void no_of_Sides();
}
 
class Trapezoid extends Shape{
	  void no_of_Sides(){
		System.out.println("NO of Sides in  trapezoid are:: 4 ");
	}
}

class Triangle extends Shape{
	 public void no_of_Sides(){
		System.out.println("NO of Sides in  triangle are:: 3 ");
	}
}
class Hexagon extends Shape{
	 public void no_of_Sides(){
		System.out.println("NO of Sides in  hexagon are:: 6 ");
	}
}

public class CreateAbstractClass {
      public static void main(String args[]){
    	  Scanner sc=new Scanner(System.in);
    	  Triangle Tri=new Triangle();
    	  Trapezoid Trap=new Trapezoid();
    	  Hexagon Hex=new Hexagon();
    	  
    	  boolean i=true;
    	  
    while(i)
     {
    	  System.out.println("Enter your  choice:: \n1.Triangle\n2.Trapezoid\n3.Hexagon\n4.Exit");
    	  System.out.println("Enter Your Choice");
    	  int ch= sc.nextInt();
    	  
    	switch(ch)
    	{
    	case 1:
    		  Tri.no_of_Sides();
    		  break;
 
    	case 2:
    		  Trap.no_of_Sides();
    	      break;
    	case 3:
    		  Hex.no_of_Sides();
               break;
    	case 4:
    		 System.exit(0);
    		   break;
    	default:	   
    		System.out.println("Oppps!!! Wrong Selection.....");
    	  }
      }
}
}
