
public class LeapYearEx {
	
	
	    public static void main(String[] args) {
	        java.util.Scanner sc = new java.util.Scanner(System.in);

	        System.out.print("Enter year: ");
	        int year = sc.nextInt();

	        String result = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
	                        ? "Leap Year"
	                        : "Not a Leap Year";

	        System.out.println(result);
	    }
	}
