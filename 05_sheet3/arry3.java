import java.util.Scanner;
public class arry3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
     
        for(int i=0;i<n;i++){
          int x=sc.nextInt(); 
            if(x<=10){
              System.out.println("A["+i+"]= "+x);   
            }
           
         }
        
         sc.close();
    }
}
