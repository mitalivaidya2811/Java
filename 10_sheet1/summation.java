import java.util.Scanner;
public class summation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int lastN=N%10;
        int lastM=M%10;
        System.out.println(lastN+" "+"+"+" "+lastM+" "+"="+" "+(lastN+lastM) );
        sc.close();
    }
}
