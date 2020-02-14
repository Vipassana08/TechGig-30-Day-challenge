

	import java.util.*;
	public class HelloTechgig {
		  public static void main(String args[] ) throws Exception {
			 
		    //System.out.println("inside main");
			 Scanner scanner = new Scanner(System.in);
			 //System.out.println("enter string : ");
			 String input = scanner.nextLine();
			 //System.out.println(input);
			 scanner.close();
			 HelloTechgig cc = new HelloTechgig();
			 System.out.println(cc.logic(input));
			 //cc.logic(input);
			   }
			   public String logic(String input){
				   
			       String newLine= System.getProperty("line.separator");
			       String output = "Hello Techgig"+newLine+ input;
			       
		         return output;
			   }
		}

