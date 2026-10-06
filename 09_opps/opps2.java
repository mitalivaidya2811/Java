class Student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
        System.out.println("constructor called");
    }
    }

public class opps2 {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="Mitali";
        s1.age=23;
        s1.printinfo();
    }
    
}
