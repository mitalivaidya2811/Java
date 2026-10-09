import java.util.Scanner;
public class greater {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();
        if(A>=B){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        sc.close();
    }
}
