import java.util.Scanner;
public class arry2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for(int i=0; i<n;i++){
        int x=sc.nextInt();
           if(x>0){
            x=1;
           }else if(x<0){
            x=2;
           }
           System.out.println(x+" ");
    }
    sc.close();

        
    }
}
