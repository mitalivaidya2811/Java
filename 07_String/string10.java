import java.util.Scanner;
public class string10 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter your email id : ");
    String email=sc.next();
    String username = " ";
    for(int i=0;i<email.length();i++){
        if(email.charAt(i)=='@'){
            break;
        }else{
            username = username+email.charAt(i);
        }
    } 
    System.out.println(username);
    sc.close();   
    }
   
}
