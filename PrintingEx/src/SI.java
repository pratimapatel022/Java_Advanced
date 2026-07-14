//Write a program to calculate simple interest and all the values given by the user.

public class SI {
public static void main(String rgs[]) {
	java.util.Scanner sc=new java.util.Scanner(System.in);
	
	         System.out.println( "Enter Principle Amount : " );
	         double p = sc.nextDouble();
	         
	         System.out.println( "Enter Rate : " );
	         double r = sc.nextDouble();
	         
	         System.out.println( "Enter Time : " );
	         double t = sc.nextDouble();
	         
	         
	            double  si = p*r*t/100;
	            System.out.println( "Simple Interest : "+si );
	            sc.close();
}
}
	         
	         