import java.util.Scanner;
public class checkfloatint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double N= sc.nextDouble();
        int integerpart=(int)N;
        if(N==integerpart){
            System.out.println("int"+integerpart);
        }
        else{
            double decimalpart=N-integerpart;
            System.out.printf("float %d %.3f%n", integerpart, decimalpart);
        }
        sc.close();
    }
}
