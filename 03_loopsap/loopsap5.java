import java.util.Scanner;
public class loopsap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(i*n);
        }
        sc.close();
    }
    
}
