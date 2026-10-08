package bank;
 class Account{
    public String name;
    protected String email;
    private String password;
    //getters and setters
    public String getPassword(){
        return  this.password;
    }
    public void  setPassword(String pass){
        this.password=pass;
    }
 }
public class bank {
    public static void main(String[] args) {
        Account account1= new Account();
        account1.name="Mitali";
        account1.email="Mitali@123";
        account1.setPassword("abc");
        System.out.println(account1.getPassword());
    }
}
