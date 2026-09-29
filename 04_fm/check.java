import java.util.Scanner;
public class check {
    public static void main(String[] args) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        System.out.println("press 1 to continue and 0 to break");
        Scanner sc= new Scanner(System.in);
        int input = sc.nextInt();
        while(input == 1){
            System.out.print("enter the number : ");
            int number=sc.nextInt();
            if(number>0){
                positive++;
            }else if(number<0){
                negative++;
            }else{
                zero++;
            }
            System.out.println("press 1 to continue and 0 to break");
             input =sc.nextInt();

             }
             System.out.println("positives : "+positive);
             System.out.println("negatives : "+negative);
             System.out.println("zeros: "+zero);
       sc.close();
    }
    
}
