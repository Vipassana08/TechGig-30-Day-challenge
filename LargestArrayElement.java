import java.util.Scanner;

public class LargestArrayElement{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int array[] = new int[size];
		for(int i=0; i<size; i++){
			array[i] = scan.nextInt();
		}
		
        int largest = array[0];
       
        for(int element :array){
        	if(element > largest){
        		largest = element;
        	}
        }
        System.out.println(largest);
	}
}