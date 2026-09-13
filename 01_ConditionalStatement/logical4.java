public class logical4 {
    public static void main(String[] args) {
        Boolean a = false;
        Boolean b = false;
         System.out.print("for Logical AND : ");
        if(a && b){
            System.out.println("t");
        } else{
                System.out.println("f");
            }
        System.out.print("for logical OR : ");
        if(a||b){
            System.out.println("t");
        } 
        else{
            System.out.println("f");
        }  
        System.out.println("for logical NOT : ");
        System.out.print("NOT(A) is ");
        System.out.println(!a);
        System.out.print("NOT(B) is ");
        System.out.println(!b);
        Boolean c = true;
        Boolean d = false;
        System.out.print("for logical AND : ");
        if(c&&d){
            System.out.println("t");
        }else{
            System.out.println("f");
        }
      
        System.out.print("for logical OR : ");
        if(c||d){
            System.out.println("t");
        }
        else{
            System.out.println("f");
        }
    }
    
}
