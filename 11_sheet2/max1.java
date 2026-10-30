import java.util.Scanner;
public class max1 {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int N=sc.nextInt();
    int max=0;
    for(int i=0;i<=N;i++){
        int X=sc.nextInt();
        if(X>max){
            max=X;
        }
    }
    System.out.println("the maximum numbeer is: "+max);
    sc.close();
   } 
}
