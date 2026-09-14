import java.util.Scanner;
public class conditional8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num =sc.nextInt();
        if(num==1){
            System.out.println("the day is monday ");
        }
        else if(num==2){
            System.out.println("the day is tuesday ");
        }
        else if(num==3){
            System.out.println("the day is wednesday ");
        }
        else if(num==4){
            System.out.println("the day is thursday");
        }
        else if(num==5){
            System.out.println("the day is friday");
        }
        else if(num==6){
            System.out.println("the day is saturday");
        }
        else if(num==7){
            System.out.println("the day is sunday ");
        }
        else{
            System.out.println("it is an invalid number");
        }
            
    sc.close();
         
    }
    
}
