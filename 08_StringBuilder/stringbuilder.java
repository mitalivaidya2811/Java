
public class stringbuilder {
    public static void main(String[] args) {
       StringBuilder sb= new StringBuilder("tony");
       System.out.println(sb);
       //char at index 0
       System.out.println(sb.charAt(0));
       //set char at index 0
       sb.setCharAt(0, 'p');
       System.out.println(sb);
       sb.insert(0, 's');
       System.out.println(sb);
       sb.insert(2, 'n');
       System.out.println(sb);
       //delete extra n
       sb.delete(2, 4);
       System.out.println(sb);
        

    }
}
