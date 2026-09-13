
import java.util.Scanner;
public class casebased1 {
    public static void main(String[] args) {
        System.out.print("enter your age ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age) {
        case 13:
        System.out.println("you are going to become a teenager");
         break;
         case 18:
        System.out.println("you are going to become an adult");
        break;
        case 23:
        System.out.println("you are to join a job");
        break;
        case 60:
        System.out.println("you are to get  a retired");
        break;
        default:
        System.out.println("enjoy your life");
        break;
        }
        sc.close();
    }
    
}
