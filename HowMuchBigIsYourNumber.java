import java.util.Scanner;


public class HowMuchBigIsYourNumber {
	public static void main(String args[] ) throws Exception {


	    Scanner scan = new Scanner(System.in);
	    int integer = scan.nextInt();
	    int count = 0; 
	    if(integer>=1)
	    {
	       while(integer!=0)
	       {
	          integer =integer/10;
	          count++;
	        }
	      }
	      System.out.print(count);
	   }
}
