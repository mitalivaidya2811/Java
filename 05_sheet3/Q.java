import java.util.Scanner;
public class Q {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T= sc.nextInt();
        for(int t=0;t<T;t++){
            int N=sc.nextInt();
            int[] arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            int count=0;
            int len =1;
            for(int i=1;i<N;i++){
                if(arr[i]>=arr[i-1]){
                    len++;
                }else{
                    count+=len*(len+1)/2;
                    len=1;
                }
            }
            count +=len*(len+1)/2;
            System.out.println(count);
        }
        sc.close();
    }
}
