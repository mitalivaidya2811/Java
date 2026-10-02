import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 to continue and 0 to break");
        System.out.print("enter the input : ");
        int input;
        do{
            int marks = sc.nextInt();
            if(marks>=90&&marks<=100){
                System.out.println("This is good");
                }
            else if(marks>=60&&marks<=89){
                System.out.println("This is also Good");
                }
            else if(marks>=0&&marks<=59){
                System.out.print("This is good as well ");
                System.out.println("Because marks don't matter but our effort does");
            }else{
                System.out.println("this is invalid number");
            }
            System.out.println("enter 1 to continue and 0 to break");
            System.out.println("enter the input : ");
            input=sc.nextInt();
        }while(input==1);
        sc.close();
    }
    
}
