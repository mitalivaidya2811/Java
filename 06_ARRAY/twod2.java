import java.util.Scanner;
public class twod2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no. of rows : ");
        int rows =sc.nextInt();
        System.out.print("enter the no. of cols : ");
        int cols=sc.nextInt();
        System.out.println("enter the numbers : ");
        int numbers[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0; j<cols;j++){
                numbers[i][j]= sc.nextInt();
            }
         }
        System.out.println("enter the number x : "); 
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j]==x){
                    System.out.println("x found at location("+i+","+j+")");
                }
            }
        }
        sc.close();
    }
}
