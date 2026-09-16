import java.util.Scanner;

public class primeq1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("the number of test cases are : ");
        int t = sc.nextInt();
        for(int i = 1; i<=t ;i++){
        System.out.print("the number are: ");
            int n =sc.nextInt();
            int count = 0;
            for( int div = 2; div*div<=n; div++){
                if(n%div ==0){
                    count++;
                    break;
                }

            }
            if(count==0){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }

        }
        sc.close();
    }
    
}
