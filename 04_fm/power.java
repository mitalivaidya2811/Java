import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x : ");
        int x = sc.nextInt();
        System.out.print("enter n : ");
        int n = sc.nextInt();
        int result = 1;
        for(int i=1;i<=n;i++){
            result=result*x;
        }
        System.out.println("the result is : "+result);
        sc.close();
    }
}