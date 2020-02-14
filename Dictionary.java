import java.util.Scanner;


public class Dictionary {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			if(input < 10000){
				String words[] = new String[input];
				for(int i=0; i<input; i++){
					words[i]= scan.next();
					//System.out.print(words[i]);
				}
				String temp;
				for(int i=0; i<input-1; i++){
					for(int j=i+1; j<input; j++){
						if( words[i].compareTo(words[j])>0){
							temp = words[i];
							words[i]= words[j];
							words [j] = temp;
							
						}
					}
				}
				
				for(int i=0; i<input; i++)
	         {
	            System.out.print(words[i]);
					if( i != input-1 ){
						System.out.println();
				}
	            
				}
			}else{
				System.out.print("max limit 10000");
			}
	}

}
