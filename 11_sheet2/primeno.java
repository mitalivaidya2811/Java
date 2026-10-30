import java.util.Scanner;
public class primeno {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int X=sc.nextInt();
        int count=0;
        for(int i=2;i<=X;i++){
           if(i%2==0){
            count++;
           }
          if(count==2){
            System.out.println(i+" "+"is"+" "+"prime");
          }
          else{
            System.out.println(i+" "+"is"+" "+"not prime");
          } 
        }
        sc.close();
    }
}
