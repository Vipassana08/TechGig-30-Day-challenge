import java.util.Scanner;


public class ConditionalStatements {
public static void main(String[] args) {
	
	   
	   
	 	Scanner scan = new Scanner(System.in);
	    int age= scan.nextInt();
	    if(age<10)
	    {
	       System.out.print("I am happy as having no responsibilities.");
	    } 
	    else if(age>=10 && age <18)
	    {
	       System.out.print("I am still happy but starts feeling pressure of life.");
	    }
	    else if(age>=18){
	       System.out.print("I am very much happy as i handled the pressure very well.");
	    }

   
}
}
