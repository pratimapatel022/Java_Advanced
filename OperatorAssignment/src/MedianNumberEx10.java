
public class MedianNumberEx10 {
	
	    public static void main(String[] args) {
	        int a = 10, b = 30, c = 20;

	        int median = ((a > b) ?
	                        ((a < c) ? a : (b > c ? b : c))
	                        :
	                        ((a > c) ? a : (b < c ? b : c)));

	        System.out.println("Median = " + median);
	    
	}
}
