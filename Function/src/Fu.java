
public class Fu {
	
	    static boolean isArmstrong(int n) {
	        int temp = n, sum = 0, digits = 0;

	        while (temp != 0) {
	            digits++;
	            temp /= 10;
	        }

	        temp = n;

	        while (temp != 0) {
	            int rem = temp % 10;
	            sum += Math.pow(rem, digits);
	            temp /= 10;
	        }

	        return sum == n;
	    }

	    public static void main(String[] args) {
	        System.out.println(isArmstrong(153));
	    }
	
}
