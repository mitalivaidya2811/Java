import java.util.Scanner;

public class twod3 {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no. of n : ");
        int n =sc.nextInt();
        System.out.print("enter the no. of m : ");
        int m=sc.nextInt();
        System.out.println("enter the numbers : ");
        int matrix[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0; j<m;j++){
                matrix[i][j]= sc.nextInt();
            }
         }
         System.out.println("The transpose of a matrix is : ");
         for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
         }
         sc.close();
}
}