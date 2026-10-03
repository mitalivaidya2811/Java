import java.util.Scanner;
public class ascending {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array : ");
    int size = sc.nextInt();
    int numbers[] = new int[size];
    for(int i=0;i<size;i++){
        numbers[i]= sc.nextInt();
    }
    Boolean isascending=true;
    for(int i=0;i<numbers.length-1;i++){
        if(numbers[i]>numbers[i+1]){
            isascending = false;
        }
    }
        if (isascending) {
            System.out.println("its ascending");
        } else {
            System.out.println("Not asending");
        }
        sc.close();
   } 
}
