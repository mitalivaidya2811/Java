 class pen{
    String colour;
    String type;
    public void write(){
        System.out.println("writing somthing");
    }
    public void printcolour(){
        System.out.println(this.colour);
    }
 }
public class opps1 {
    public static void main(String[] args) {
        pen pen1=new pen();
        pen1.colour="blue";
        pen1.type="gelpen";
        pen1.write();
        pen pen2=new pen();
        pen2.colour="black";
        pen2.type="ballpoint";
        pen1.printcolour();
        pen2.printcolour();
    }
    
}
