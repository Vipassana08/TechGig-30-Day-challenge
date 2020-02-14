import java.util.Scanner;


public class ConcatinateMatrice {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	   int r1,c1,r2,c2;
	   int i,j;
	   r1 = sc.nextInt();
	   c1 = sc.nextInt();

	   int m1[][]; 
	   m1 = new int [r1][c1];
	   if((r1>1&&r1<100) && (c1>1&&c1<100))
	   {

	      for(i=0;i<r1;i++)
	      {
	         for(j=0;j<c1;j++)
	         m1[i][j] = sc.nextInt();
	      }
	   }
	   else
	   System.out.print("Wrong input");

	   r2 = sc.nextInt();
	   c2 = sc.nextInt();

	   int m2[][]; 
	   m2 = new int [r2][c2];
	   if((r2>=1 && r2<=100) && (c2>= 1 && c2<=100))
	   {

	      for(i=0;i<r2;i++)
	      {
	         for(j=0;j<c2;j++)
	         m2[i][j] = sc.nextInt();
	      }
	   }
	   else
	   System.out.print("Wrong input");   

	   if(r1==r2 && c1==c2)
	   {
	      for(i=0;i<r2;i++)
	      {
	         for(j=0;j<c2;j++)
	         m2[i][j] += m1[i][j];
	      }
	   }
	   else
	   System.out.print("Wrong Input");

	   for(i=0;i<r2;i++)
	      {
	         for(j=0;j<c2;j++)
	         {
	         System.out.print(m2[i][j]);
	         if(j!=(c2-1))
	         System.out.print(" ");
	         }

	         if(i!=(r2-1))
	         System.out.print('\n');
}
}
}
