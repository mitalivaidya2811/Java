import java.util.Scanner;

public class primeno01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= X; i++) {
            if (X % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}