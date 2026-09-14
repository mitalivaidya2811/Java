import java.util.Scanner;
public class conditional7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maths,chemistry,physics,hindi,english;
        System.out.println("enter the marks of maths: ");
        maths = sc.nextInt();
         System.out.println("enter the marks of chemistry: ");
        chemistry = sc.nextInt();
        System.out.println("enter the marks of physics: ");
        physics = sc.nextInt();
     System.out.println("enter the marks of hindi: ");
        hindi = sc.nextInt();
     System.out.println("enter the marks of english: ");
        english = sc.nextInt();
    System.out.print("your average marks is : ");
        float avg = (maths+chemistry+physics+hindi+english)/5.0f;
        System.out.println(avg);
        if(avg>=40 && maths>=33 && chemistry>=33 && physics>=33 && hindi>=33 && english>=33){
            System.out.println("congratulations, you have been promoted");
        }
        else{
            System.out.println("sorry, you hava not been promoted ");
        }
        sc.close();
    }
}
