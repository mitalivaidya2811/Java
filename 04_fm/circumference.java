import java.util.Scanner;
public class circumference {
    public static double circumferenceOfCircle(int r,double pi){
        double circumference = 2*pi*r;
        return circumference ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius : ");
        int r =sc.nextInt();
        double pi = 3.14;
        System.out.println(circumferenceOfCircle(r, pi));
        sc.close();
    }
    
}
