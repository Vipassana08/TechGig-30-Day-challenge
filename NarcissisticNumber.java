import java.util.Scanner;

 public class NarcissisticNumber{
	 public static void main(String[] args) {
		 
		 int count = 0;
		 int remainder;
		 int sum = 0;
		Scanner scan = new Scanner(System.in);
		int integer = scan.nextInt();
		//System.out.println(integer);
		int temp = integer;
		if(integer >=1)
		{
			while(temp!= 0)
			{
			  temp= temp/10;
			  count++;	
		    }
	     }
		//System.out.println(count);
		temp=integer;
		while(temp !=0)
		{
		  remainder = temp % 10;
		  sum = (int) (sum + (Math.pow(remainder, count)));
		  temp = temp /10;
		}
		//System.out.println(sum);
		if(integer ==sum ){
			System.out.print("True");
		}else{
			System.out.print("False");
		}
		
	}
 }