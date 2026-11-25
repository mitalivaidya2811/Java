import java.util.Scanner;
public class evennumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int found=0;
        for(int i=1;i<=N;i++){
            if(i%2==0){
                System.out.println(i);
                found++;
            }
        }
         if(found==0){
                System.out.println(-1);
        }
        sc.close();
    }
}
