

public class DigitCount {
public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("Enter a no.");
	 int num=sc.nextInt();
	 int count=0;
	 int sum=0;
	 
 if(num==0) {
		 count=1;
	 }
	
	while(num!=0) {
		int digit = num%10;
		sum += digit;
		count++;
		num=num/10;
	}
	System.out.println(" Number of digit: " +count);
	System.out.println("Sum of digits: " +sum);
}
}
