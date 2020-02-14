import java.util.Scanner;


public class LoopYourWorld {
	static int factorial = 1;
	public static void main(String args[] ) throws Exception {

		//Write code here
	 Scanner scan = new Scanner(System.in);
	 int integer = scan.nextInt();
	 int i;
	 for(i=1; i<=integer;i++)
	 {
         
		 factorial =  factorial*i;
		 
	 }
	 System.out.print(factorial);
	   }
}
