import java.util.Random;

public class MyPasswordRandomizer {
    private int passwordlength;
    private Random rand = new Random();
    private String password;
    private int seed;
    
    public MyPasswordRandomizer(int length) {
        this.passwordlength = length;
        this.seed = rand.nextInt();  //random seed
    }
    public void setSeed(int seed){
        this.seed = seed;
    }

    public String createPassword() {
        int i = 0;
        char randomsymbol;
        this.password = "";
        rand.setSeed(this.seed);
        String charSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        
        while(i < this.passwordlength){
            randomsymbol = charSet.charAt(rand.nextInt(charSet.length())); //26 letters * 2 (for upper and lowecase) + 10 digits 0-9 = 26*2 + 10 = 52 + 10 = 62
           this.password += randomsymbol;
           i++;
        }
        String passwordCopy = this.password;
        return passwordCopy;
        
    }
}
