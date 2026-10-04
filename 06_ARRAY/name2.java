import java.util.Scanner;
public class name2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size =sc.nextInt();
        String name[]=new String[size];
        System.out.print("enter the names : ");
        for(int i=0;i<size;i++){
             name[i]=sc.next();
           }
        System.out.print("the names are : ");
        for(int i=0;i<name.length-1;i++){
            System.out.println("name "+(i+1)+" is : "+ name[i]);
        }
        sc.close();
    }
    
}
