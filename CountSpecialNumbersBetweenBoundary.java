import java.util.Scanner;


public class CountSpecialNumbersBetweenBoundary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first number");
		int first = scan.nextInt();
		System.out.println("enter last number ");
		int last = scan.nextInt();
		if(first<1 && first>100000)
			System.out.println("enter value lesser than 100000 and greter than or equal to 2.");
		if(last>first && last>100000)
			System.out.println("enter value less than 100000 and greter than first value. ");
		
		
		int number = first;
		int count = 0;
		
		
		
		for(int j= number; j <= last; j++)
		{ int i =2;// standard pre-defined logic.
		  while(number >1 && number %i!=0)
		  {   // if remainder is not equal to zero then increment value of i.
			i++;
		  }
		    if(number == i)
		    {
			 //System.out.println("number is prime ");
			 count++;
		    }else
		     {
			 //System.out.println("not a prime number");
		     }
		    number++;
		}
		System.out.println(count);
		
	}

}
