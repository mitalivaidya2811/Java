import java.util.Scanner;
public class avg {
    public static int calculateAvg(int a,int b,int c){
        int sum = a+b+c;
        int avg=sum/3;
        
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the first number : ");
        int a=sc.nextInt();
        System.out.print("enter the second number : ");
        int b=sc.nextInt();
        System.out.print("enter the third number : ");
        int c=sc.nextInt();
        System.out.print("the avg is : ");
        System.out.println(calculateAvg(a, b, c));
        sc.close();
    }
    
}
