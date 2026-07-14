
public class PerfectSquare {
	   public static void main(String[] args) {
	        java.util.Scanner sc = new   java.util.Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int root = (int)Math.sqrt(num);

	        if(root * root == num)
	            System.out.println(num + " is a Perfect Square");
	        else
	            System.out.println(num + " is not a Perfect Square");
	    }
	
}
