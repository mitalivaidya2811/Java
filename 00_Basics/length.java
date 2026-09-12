public class length {
    public static void main(String[] args) {
        String name = " Mitali ";
        int value = name.length();
        System.out.println(value);
        String name1 = name.toLowerCase();
        System.out.println(name1);
        String name2 = name.toUpperCase();
        System.out.println(name2);
         String name3 = name.trim();
        System.out.println(name3);
         System.out.println(name.substring(2));
        System.out.println(name.substring(1,4));
         System.out.println(name.replace( 'i','r'));
         System.out.println(name.replace("tal","irr"));
         System.out.println(name.startsWith("tal"));
         System.out.println(name.endsWith("al"));
         System.out.println(name.charAt(3));
         System.out.println(name.indexOf('t'));
         System.out.println(name.indexOf("ta"));
        String modifiedname = "mitmitali";
        System.out.println(modifiedname.indexOf("tmi"));
         System.out.println(modifiedname.indexOf("ta" , 4));
        System.out.println(modifiedname.lastIndexOf("al",3));
         System.out.println(name.endsWith("Mitali"));
        System.out.println(name.equalsIgnoreCase("MiTali"));
         System.out.println("I am escape sequence\"double quote");
         System.out.println("I am escape sequence\\double quote");


    }
    
}
