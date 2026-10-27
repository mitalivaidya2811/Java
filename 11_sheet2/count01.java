import java.util.Scanner;
public class count01 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int N=sc.nextInt();
    int even=0,odd=0,positive=0,negative=0;
   
    for(int i=0;i<N;i++){
        int X=sc.nextInt();
        if(X%2==0){
            even++;
        }
        else if(X%2!=0){
            odd++;
        }
         if(X>0){
           positive++;
        }
         else if(X<0){
           negative++;
        }
    }
    System.out.println("number of even no. is: "+even);
    System.out.println("number of odd no. is: "+odd);
    System.out.println("number of positive no. is: "+positive);
    System.out.println("number of negative no. is: "+negative);
    sc.close();
  }  
}
