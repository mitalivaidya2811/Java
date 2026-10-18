import java.util.Scanner;
public class comparision3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int A=sc.nextInt();
        char S=sc.next().charAt(0);
        int B=sc.nextInt();
        if(S=='<'&&A<B){
            System.out.println("right");
        }
        else if(S=='>'&&A>B){
            System.out.println("right");
        }
        else if(S=='='&&A==B){
            System.out.println("right");
        }
        else{
            System.out.println("wrong");
        }
        sc.close();
    }
}
