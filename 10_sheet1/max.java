import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A= sc.nextInt();
         int B= sc.nextInt();
         int C= sc.nextInt();
        if(A>B||B>C){
            System.out.println("maximum number is: "+A);
            System.out.println("minimum nuber is: "+C);
        }
        else if(B>C||C>A){
            System.out.println("maximum number is: "+B);
            System.out.println("minimum number is: "+A);
        }else{
            System.out.println("maximum number is: "+C);
            System.out.println("minimum number is: "+B);
        }
        
        sc.close();
    }
}
