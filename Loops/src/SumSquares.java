
public class SumSquares {
	
	    public static void main(String args[]) {
	        java.util.Scanner sc = new   java.util.Scanner(System.in);
	        int n = sc.nextInt();
	        int sum = 0;

	        for(int i=1; i<=n; i++) {
	            sum += i*i;
	        }
	        System.out.println(sum);
	    }
	}

