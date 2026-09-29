import java.util.Scanner;


public class greater {
    public static int greaterNum(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
       
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.print("enter the first number : ");
    int a =sc.nextInt();
    System.out.print("enter the second number : ");
    int b = sc.nextInt();
    System.out.print(greaterNum(a,b));
        sc.close();
   
    }
    

    
}
