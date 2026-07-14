
public class AreaSwitch {
	
	
	    public static void main(String[] args) {
	        java.util.Scanner sc = new java.util.Scanner(System.in);

	        System.out.println("1. Circle");
	        System.out.println("2. Square");
	        System.out.println("3. Rectangle");
	        System.out.println("4. Triangle");
	        System.out.print("Enter choice: ");

	        int choice = sc.nextInt();

	        switch(choice) {
	            case 1:
	                System.out.print("Enter radius: ");
	                double r = sc.nextDouble();
	                System.out.println("Area = " + (3.14 * r * r));
	                break;

	            case 2:
	                System.out.print("Enter side: ");
	                double s = sc.nextDouble();
	                System.out.println("Area = " + (s * s));
	                break;

	            case 3:
	                System.out.print("Enter length and breadth: ");
	                double l = sc.nextDouble();
	                double b = sc.nextDouble();
	                System.out.println("Area = " + (l * b));
	                break;

	            case 4:
	                System.out.print("Enter base and height: ");
	                double base = sc.nextDouble();
	                double h = sc.nextDouble();
	                System.out.println("Area = " + (0.5 * base * h));
	                break;

	            default:
	                System.out.println("Invalid Choice");
	        }
	    }
	
}
