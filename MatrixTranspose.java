import java.util.Scanner;


public class MatrixTranspose {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    int row,column;
    row = scan.nextInt();
    column = scan.nextInt();
    if((row >1 && row <100) && (column >1 && column <100)){
       System.out.print(row);
       System.out.println(column);
      }else
       {
          System.out.print(" Enter valid input");
       }
    int matrix [][] = new int[row][column];
    for(int i =0; i<row; i++)
    {
       for(int j=0; j<column; j++)
       {
          matrix[i][j] = scan.nextInt();
           
         }
       }
     for(int i =0; i<row; i++)
    {
       for(int j=0; j<column; j++)
       {
          matrix[j][i] = matrix[i][j];
          System.out.print(matrix[j][i]);
          if(j != column-1){
             System.out.print(" ");
          }
           
         }
         if(i != row-1){
         System.out.println();
         }
       }
}
}
