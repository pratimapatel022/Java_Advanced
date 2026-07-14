
public class IfEx1 {
public static void main(String[] args) {
	java.util.Scanner sc=new java.util.Scanner(System.in);
	
	System.out.println("Enter your age: ");
	int age=sc.nextInt();
	if(age>=13 && age<19) {
	System.out.println(" you'r Teenager: ");
	}
	else {
		System.out.println(" you're  not Teenager: ");
	}
	System.out.println("Thank you  ");
}
}
