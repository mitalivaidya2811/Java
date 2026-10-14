import java.util.Scanner;
public class firstdigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int X=sc.nextInt();
        int firstdig=X/1000;
        if(firstdig%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        sc.close();
    }
}
