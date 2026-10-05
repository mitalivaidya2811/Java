import java.util.Scanner;
public class arry4 {
   public static void main(String[] args) {
    Scanner  sc= new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
     int min= Integer.MAX_VALUE;
    int x=0;
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       if(arr[i]<min){
        min =arr[i];
       } 
       x=i;
    }
    System.out.println("the lowest value"+" "+min+" "+"is found at index number "+x);
       sc.close();
   } 
}
