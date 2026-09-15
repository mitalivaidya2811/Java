import java.util.Scanner;

public class loops02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n= Integer.parseInt(sc.nextLine()); 
        System.out.print("enter your name : ");
        String name = sc.nextLine();
        System.out.println("Dear "+ name + " here is the counting" );
        for( int i=1; i<=n;i++){
            System.out.println(i);
        }
 sc.close();
    }
    
}
