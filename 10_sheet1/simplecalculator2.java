import java.util.Scanner;
public class simplecalculator2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the first number : ");
        int A= sc.nextInt();
        System.out.print("enter the operator: ");
        char op= sc.next().charAt(0);
        System.out.print("enter the second number: ");
        int B= sc.nextInt();
        if(op=='+'){
            System.out.println(A+B);
        }
        else if(op=='-'){
            System.out.println(A-B);
        }else if(op=='*'){
            System.out.println(A*B);
        }else if(op=='/'){
            System.out.println(A/B);
        }
        sc.close();
    }
}
