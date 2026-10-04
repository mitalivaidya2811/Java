public class string3 {
    public static void main(String[] args) {
        //compare
        String name1= "Mitali";
        String name2="Mitali2";
        //1 s1 > s2 : +ive value
        //2 s1 = s2 : 0
        //3 s1 < s2: -ive value
        if(name1.compareTo(name2)==0){
            System.out.println("String are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
    
}
