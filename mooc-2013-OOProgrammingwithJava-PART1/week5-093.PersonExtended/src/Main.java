public class Main {
    public static void main(String[] args) {
        Person pekka = new Person("Helga", new MyDate(31, 12, 2009));
        Person sepe = new Person("Sepe");

        System.out.println( sepe.toString() );
    }
}
