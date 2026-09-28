import java.util.Scanner;
public class calculateproduct {
    public static int calculateProduct(int a,int b){
        return a*b;
    }public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first number: ");
        int a =sc.nextInt();
        System.out.print("enter the second number : ");
        int b=sc.nextInt();
        System.out.println("the product of two number is : "+calculateProduct(a, b));
        sc.close();
    }
}
