public class conditional6 {
    public static void main(String[] args) {
        int age = 18;
        boolean cond1 = (age==18);
        if(cond1){
            System.out.println("yes boy you cannot drive");
        }else{
            System.out.println("no boy you cannot drive");
        }
        boolean cond2 = (age < 18);
        if(cond2){
            System.out.println("no boy you cannot drive");
        } 
        else{
            System.out.println("yes boy you can drive");
        }
        int age2 = 19;
        boolean cond3 = (age2<18);
        if(cond3){
            System.out.println("no boy you cannot drive");
        }
        else{
            System.out.println("yes boy you can drive");
        }
        boolean cond4 =(age2>=18);
        if(cond4){
            System.out.println("yes boy you can drive");
        }
        else{
            System.out.println("no boy you cannot drive");
        }
    
        
    }
    
}
