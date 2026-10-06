import java.util.Scanner;
public class diffenceq1 {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int X=(a*b)-(c*d);
        System.out.println(X);
        sc.close();
      }
}