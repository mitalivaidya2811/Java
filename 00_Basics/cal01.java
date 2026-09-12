import java.util.Scanner;
public class cal01 {            
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1 :");
        float num1 = sc.nextFloat();
        System.out.print("enter num 2 : ");
        float num2 = sc.nextFloat();
        System.out.print("enter num3 : ");
        float num3 = sc.nextFloat();
        System.out.print("enter num4 : ");
        float num4 = sc.nextFloat();
        float total = num1*num2+num3/num4;
        System.out.println(total);
        sc.close();

        
    }
    
}
