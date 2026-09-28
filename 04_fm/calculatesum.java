import java.util.Scanner;
public class calculatesum {
 public static int calculateSum(int a,int b){
    int sum = a+b;
    return sum;
 }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the first number : ");
    int a=sc.nextInt();
    System.out.print("enter the second number : ");
    int b=sc.nextInt();
    int sum=calculateSum(a, b);
    System.out.println("the sum of two number is : "+sum);
    sc.close();
 }
    
}
