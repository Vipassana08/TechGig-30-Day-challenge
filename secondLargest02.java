import java.util.Scanner;


public class secondLargest02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int array[] = new int[size];
		for(int i=0; i<size; i++){
			array[i] = scan.nextInt();
		}
		
		
		int check, ans;
		check=ans=array[0];
		 for(int i =0; i<size; i++){
			 if(array[i]>check){
				 ans = check;
				 check=array[i];
				 
			 }
		 }
		 System.out.print(ans);
		
		
		
	}
	
	
}

