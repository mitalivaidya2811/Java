import java.util.Scanner;
public class string8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of strings : ");
      int n=sc.nextInt();
      String arr[]=new String[n];
      int totallength=0;
      for(int i=0;i<n;i++){
        System.out.println("enter the string "+(i+1));
        arr[i]=sc.next();
        totallength=totallength+arr[i].length();
    }
    System.out.println("the commutative length is : "+totallength);
    sc.close();
    }
    
}
