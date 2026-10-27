import java.util.Scanner;
public class multab {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int X=sc.nextInt();
        int N=sc.nextInt();
        for(int i=1;i<X;i++){
            System.out.println(N+" "+"*"+" "+i+" "+"="+" "+N*i);
        }
        sc.close();
    }
}
