public class Program {
    public static void main(String[] args) {
        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        PasswordRandomizer newRandomizer = new PasswordRandomizer(15);
        
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("New password: " + newRandomizer.createPassword());
        System.out.println("New password2: " + newRandomizer.createPassword());
    }
}
