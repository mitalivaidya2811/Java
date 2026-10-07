
class shape{
    public void area(){
        System.out.println("displays area :");
    }
}
class triangle extends shape{
    public  void area(int l,int h){
        System.out.println(1.0/2*l*h);
    }
}
class circle extends shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
public class hirarchial {
public static void main(String[] args) {
 shape s = new shape();
 s.area();
 triangle t=new triangle();
 t.area(10,5);
 t.area();
 circle c= new circle();
 c.area(4);
 
}
    
}