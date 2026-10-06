
public class stringbuilder4 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("sentence");
        String result=" ";
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='e'){
               result=result+"i";
            }
            else{
                result=result+sb.charAt(i);
            }
        }
        System.out.println(result);
    }
    
}
