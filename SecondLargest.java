import java.util.Scanner;


public class SecondLargest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int array[] = new int[size];
		for(int i=0; i<size; i++){
			array[i] = scan.nextInt();
		}
		
        int largest = array[0];
        int secondLargest = array[0];
       
        for(int element :array){
        	if(element > largest){
        		secondLargest = largest;
        		largest = element;
        		
        	}
        }
        //System.out.println(largest);
        System.out.print(secondLargest);
	}

}
