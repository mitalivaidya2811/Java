public class printsum {
    public static int sum(){
        int n=5;
        int m=0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
         m= m+i;
        
     }
        }
        return m;
    }
    public static void main(String[] args) {
        
        System.out.println (sum());
    }
    
}
