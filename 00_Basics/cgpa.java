import java.util.Scanner;
public class cgpa {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the marks of ed : ");
    Float ed = sc.nextFloat();
    System.out.println("enter the number of chemistry : ");
    Float chemistry = sc.nextFloat();
    System.out.println("enter the number of english : ");
    Float english = sc.nextFloat();
    System.out.println("enter the number of maths : ");
    Float maths = sc.nextFloat();
    System.out.println("enter the marks of beee : ");
    Float beee = sc.nextFloat();
    // to calculate the sum of marks.
    Float total = ed+chemistry+english+maths+beee;
    Float cgpa = total/50;
    System.out.println("the cgpa is : "+cgpa);
    sc.close();
    }
    
}
