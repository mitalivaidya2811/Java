import java.util.Scanner;
public class sum4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1:");
        int a = sc.nextInt();
        System.out.println("enter number 2:");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("the sum of these number is : "+sum);
        
        sc.close();
    }
}
