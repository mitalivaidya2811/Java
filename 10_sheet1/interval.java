import java.util.Scanner;
public class interval {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int X=sc.nextInt();
    if(X==0&& X<=25){
        System.out.println("interval [0,25]");
    }
    else if(X>25&&X<=50){
        System.out.println("interval (25,50]");
    }
    else if(X>50&&X<=75){
        System.out.println("interval (50,75]");
    }
    else if(X>75&&X<=100){
        System.out.println("interval (75,100]");
    }
    else{
        System.out.println("out of interval");
    }
    sc.close();
   } 
}
