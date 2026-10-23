import java.util.Scanner;
public class lasttwodigit {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int A= sc.nextInt();
    int B=sc.nextInt();
    int C=sc.nextInt();
    int D=sc.nextInt();
    int E=A*B*C*D;
    if(E<10){
        System.out.println("invalid number");
    }
    else if(E>10&&E<100){
        System.out.println(E);
    }
    else if(E>100&&E<1000){
        System.out.println(E%100);
    }
    else if(E>1000&&E<10000){
        System.out.println(E%1000);
    }
    else {
        System.out.println("you have exceeded the limit");
    }
    sc.close();
   } 
}
