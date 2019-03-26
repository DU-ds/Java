
public class Accounts {

    public static void main(String[] args) {
        Account matt = new Account("Matt's account", 1000);
        Account mine = new Account("My account", 0);
        matt.withdrawal(100.0);
        mine.deposit(100.0);
        System.out.println(matt);
        System.out.println(mine);
        
        
    }

}
