public class string2 {
    public static void main(String[] args) {
        String firstname="Mitali";
        String secondname="Vaidya";
        String fullname=firstname+"@"+secondname;
        //.length() string ki lenth batata hai
        System.out.println(fullname.length());
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
    }

    
}
