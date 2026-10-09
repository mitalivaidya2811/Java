import java.util.Scanner;
public class paridrome {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
    }
    boolean answer = true;
    for(int i=0;i<n/2;i++){
        if(arr[i]!=arr[n-1-i]){
            answer=false;
            break;
        }
     }
     if(answer){
        System.out.println("YES");
     }else{
        System.out.println("NO");
     }
     sc.close();
   } 
}
