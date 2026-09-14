import java.util.Scanner;
public class conditionaltax {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your income lakhs per annum : ");
        float tax =0;
        Float income = sc.nextFloat();
        if(income<=2.5){
            tax = tax+0;
        } 
        else if(income >= 2.5f && income <= 5.0f){
            tax = tax + 0.05f * (income - 2.5f);
                }  
        else if(income > 5f && income <= 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income > 10.1f ){
         tax = tax + 0.05f * (5.0f - 2.5f);
        tax = tax + 0.2f * (10.0f - 5f);
        tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("the total tax paid by the employ is : "+tax); 
        sc.close();    
    }
}
