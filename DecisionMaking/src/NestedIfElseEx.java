//Write a program check wheather a no. +ve , -ve or 0. If the no. is +ve also print whether its even or odd.
public class NestedIfElseEx {
public static void main(String[] args) {
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("Enter a numbers: ");
	int n=sc.nextInt();
	if(n>0) {
		System.out.println("Number is positive:");
		if(n%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is Odd");
		}
			
	}
	else if(n<0) {
		System.out.println("Number is negative:");
	}
	else  {
		System.out.println("Zero");
	}
}
}
