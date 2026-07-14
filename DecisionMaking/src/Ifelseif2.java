
public class Ifelseif2 {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		if(age<0 || age>120) {
			System.out.println(" Invalid Age!! ");
		}else if(age<4) {
			
		System.out.println(" you'r Infant: ");
		}
		else if (age<13) {
			
			System.out.println(" you'r Child ");
		}
		else if(age<19) {
			System.out.println(" you're  Teenager: ");
		}
		else if(age<50) {
			System.out.println(" you're  Adult ");
		}else if(age<80) {
			System.out.println(" you're  Oldage ");
		}else  {
			System.out.println(" Kabhi bhi jaane waale ho ");
		}
		System.out.println("Thank you  ");
	}
}
