import java.util.Scanner;


public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		   int integer = scan.nextInt();
		   int sum=0;
		   int digit;
		   int temp=integer; 

		  while(temp!=0){
		      digit= temp % 10;
		      sum = sum+ (digit*digit*digit); 
		      temp = temp / 10;
	        }
		  if(sum == integer){
			  System.out.println("True");
		  }else
		  {
			  System.out.println("False");
		  }
	} 
}
	  
	   

