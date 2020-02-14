import java.util.Scanner;


public class PlayWithOperators {
public static void main(String[] args) {
	double principal;
    int interest;
    int year;
    double simple;
    Scanner scan = new Scanner(System.in);
    //System.out.println("Enter Principal value : ");
    principal= scan.nextDouble();
    //System.out.println("Enter interest value : ");
    interest= scan.nextInt();
    //System.out.println("Enter year : ");
    year= scan.nextInt();
    simple=(principal*interest*year)/100;
    System.out.println((int)simple);
	
}
}
