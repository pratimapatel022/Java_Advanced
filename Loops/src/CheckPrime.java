
public class CheckPrime {
	
	    public static void main(String args[]) {
	        java.util.Scanner sc = new java.util.Scanner(System.in);
	        int n = sc.nextInt();
	        int count = 0;

	        for(int i=1; i<=n; i++) {
	            if(n % i == 0)
	                count++;
	        }

	        if(count == 2)
	            System.out.println("Prime");
	        else
	            System.out.println("Not Prime");
	    
	}
}
