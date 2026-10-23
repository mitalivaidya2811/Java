import java.util.Scanner;
public class hardcompare {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int A= sc.nextInt();
    int B=sc.nextInt();
    int C=sc.nextInt();
    int D=sc.nextInt();
    if(Math.pow(A, B) > Math.pow(C, D)){
        System.out.println("yes");
    }
    else{
        System.out.println("No");
    }
    sc.close();
   } 
}
