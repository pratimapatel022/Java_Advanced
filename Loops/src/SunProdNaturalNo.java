
public class SunProdNaturalNo {
public static void main(String[] args) {
	java.util.Scanner sc=new java.util.Scanner(System.in);
	
	System.out.println("Enter a no.");
	 int n=sc.nextInt();
	 for(int a=1;a<=n;a++) 
			System.out.println(a);
	
	 System.out.print("Sum expression: ");
	 int sum=0;
	 for(int i=1;i<=n;i++) {
		 sum = sum+ i;
		System.out.print(i);
		 
		 if(i<n) 
		 System.out.print("+");
		
		//System.out.print(i); 
		 }
		 System.out.println("=" +sum);
		
		 System.out.print("Product expression: ");
		 long Product=1;
		 for(int i=1;i<=n;i++) {
			 Product *= i;
			System.out.print(i);
			 
			 if(i<n) 
			 System.out.print("*");
			
			//System.out.print(i); 
			 }
		 
		 System.out.print("=" +Product);
	 
	 sc.close();
	 
}
}
