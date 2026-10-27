import java.util.Scanner;
public class password {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int N=sc.nextInt();
     for(int i=0;i<=N;i++){
        int X=sc.nextInt();
        if(X!=1999){
            System.out.println("incorrect");
        }
        else{
            System.out.println("correct");
            break;
        }
        sc.close();
     }
    }
}
