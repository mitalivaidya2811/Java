class shape{
    public void area(){
        System.out.println("display area");
    }
}
class triangle extends shape{
    public void area(int l,int h){ 
        System.out.println(1.0/2*l*h);
    }
}
class equilateraltringle extends triangle{
    public void area(int l,int h){
        System.out.println(1.0/2*l*h);
    }
}
public class multilevelinheritance {
    public static void main(String[] args) {
       shape s= new shape();
       s.area();
       triangle t= new triangle();
       t.area(10,5);
       t.area();
       equilateraltringle e= new equilateraltringle();
       e.area(10,5); 
    }
}
