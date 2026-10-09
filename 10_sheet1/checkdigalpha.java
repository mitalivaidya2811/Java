import java.util.Scanner;
public class checkdigalpha {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    char X=sc.next().charAt(0);
    if(X >= '0'&& X <='9'){
        System.out.println("digits");
    }else{
        System.out.println("Alpha");
        if(X>='A'&&X<='Z'){
        System.out.println("is capital");
    }
    else{
        System.out.println("not capital");
    }
    
}

  }  
}
