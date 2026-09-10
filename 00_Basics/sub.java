import java.util.Scanner;
public class sub {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1 : ");
        int a = sc.nextInt();
        System.out.println("enter number 2 : ");
        int b = sc.nextInt();
        int sub = a-b;
        System.out.println("the sub of these number is : ");
        System.out.println(sub);
        sc.close();
    }
}