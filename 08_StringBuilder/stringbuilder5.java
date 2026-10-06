public class stringbuilder5 {
    public static void main(String[] args) {
        StringBuilder email=new StringBuilder("mitali@123");
        String username=" ";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else{
                username=username+email.charAt(i);
            }
        }
        System.out.println(username);
    }
    
}
