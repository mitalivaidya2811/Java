import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter the marks of maths : ");
        int maths = sc.nextInt();
        
        System.out.print("enter the marks of chemistry : ");
        int chemistry = sc.nextInt();
        
        System.out.print("enter the marks of physics : ");
        int physics = sc.nextInt();
        
        System.out.print("enter the marks of english : ");
        int english = sc.nextInt();
        
        System.out.print("enter the marks of hindi : ");
        int hindi = sc.nextInt();
        
        // Calculate the sum of marks
        int total = maths + chemistry + physics + english + hindi;
        
        // Formula using float to preserve decimal values
        float percentage = (total / 500f) * 100;
        
        System.out.println("the percentage is : " + percentage + "%");
        
        sc.close(); 
    }
}

