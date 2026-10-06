class Student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

Student(String name,int age){
    this.name=name;
    this.age=age;
}
}
public class opps3 {
    public static void main(String[] args) {
        Student s1=new Student("Mitali", 20);
     s1.printinfo();

    }
    
}
