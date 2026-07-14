
public class UnitConversion {
	   public static void main(String[] args) {
	        java.util.Scanner sc = new java.util.Scanner(System.in);

	        System.out.println("1. Km to Meter");
	        System.out.println("2. Meter to Cm");
	        System.out.println("3. Cm to Mm");
	        System.out.println("4. Meter to Km");

	        System.out.print("Enter choice: ");
	        int choice = sc.nextInt();

	        System.out.print("Enter value: ");
	        double value = sc.nextDouble();

	        switch(choice) {
	            case 1:
	                System.out.println("Meters = " + (value * 1000));
	                break;

	            case 2:
	                System.out.println("Centimeters = " + (value * 100));
	                break;

	            case 3:
	                System.out.println("Millimeters = " + (value * 10));
	                break;

	            case 4:
	                System.out.println("Kilometers = " + (value / 1000));
	                break;

	            default:
	                System.out.println("Invalid Choice");
	        
	    }
	}
}
