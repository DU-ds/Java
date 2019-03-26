import java.util.Random;

public class PasswordRandomizer {
    private int passwordlength;
    private Random rand = new Random();
    private String password;
    
    public PasswordRandomizer(int length) {
        this.passwordlength = length;
    }

    public String createPassword() {
        int i = 0;
        char randomsymbol;
        this.password = "";
        
        while(i < this.passwordlength){
            randomsymbol = "abcdefghijklmnopqrstuvwxyz".charAt(rand.nextInt(26)); 
            this.password += randomsymbol;
            i++;
        }
        return this.password;
    }
}
