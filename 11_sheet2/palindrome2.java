import java.util.Scanner;
public class palindrome2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int original=N;
        int rev=0;
        while(N>0){
            int digit=N%10;
            rev=rev*10+digit;
            N=N/10;
        }
        System.out.println(rev);
        if(original==rev){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}