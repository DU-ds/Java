
import java.util.Map;
import java.util.HashMap;
// import java.security.MessageDigest;
// import java.security.NoSuchAlgorithmException;
// http://www.sha1-online.com/sha1-java/

/*
The Most Difficult Program to Compute? - Computerphile
https://www.youtube.com/watch?v=i7sm9dzFtEI&t=8s
*/

public class Ackermann {

    public static void main(String[] args) {
        AckermannNaive ack1 = new AckermannNaive();
        try{
            int a = ack1.calculate(1,2);
            System.out.println("Ack(1,2): " + a);
        }
//        catch(StackOverflowError err) {
            catch(Exception e){
            System.err.println("Error: " + e);
        }
    
        AckermannNaive ack2 = new AckermannNaive();
        try{
            int a = ack2.calculate(2,2);
            System.out.println("Ack(2,2): " + a);
        }
//        catch(StackOverflowError err) {
            catch(Exception e){
            System.err.println("Error: " + e);
        }

        AckermannNaive ack3 = new AckermannNaive();
        try{
            int a = ack3.calculate(2,3);
            System.out.println("Ack(2,3): " + a);
        }
//        catch(StackOverflowError err) {
            catch(Exception e){
            System.err.println("Error: " + e);
        }

        AckermannNaive ack4 = new AckermannNaive();
        try{
            int a = ack4.calculate(3,3);
            System.out.println("Ack(3,3): " + a);
        }
//        catch(StackOverflowError err) {
            catch(Exception e){
            System.err.println("Error: " + e);
        }

        Ackermann2 ack5 = new Ackermann2(1,2);
        try {
            int a = ack5.calculate();
            System.out.println("Ack2(1,2): " + a);
        }
        catch(Exception e) {
            System.err.println("Exception: " + e);
        }

        Ackermann2 ack6 = new Ackermann2(2,2);
        try {
            int a = ack6.calculate();
            System.out.println("Ack2(2,2): " + a);
        }
        catch(Exception e) {
            System.err.println("Exception: " + e);
        }

        Ackermann2 ack7 = new Ackermann2(2,3);
        try {
            int a = ack7.calculate();
            System.out.println("Ack2(2,3): " + a);
        }
        catch(Exception e) {
            System.err.println("Exception: " + e);
        }

        Ackermann2 ack8 = new Ackermann2(3,3);
        try {
            int a = ack8.calculate();
            System.out.println("Ack2(3,3): " + ack8);
        }
        catch(Exception e) {
            System.err.println("Exception: " + e);
        }
    }

}

class AckermannNaive{
    private int m, n;


    AckermannNaive(){
        // this.n = n;
        // this.m = m;
    }


    public int calculate(int m, int n) throws IllegalAccessException{
        if(m == 0){
            return n + 1;
        }
        else if(m > 0 && n == 0 ) {
            return(this.calculate(m - 1, 1));
        }
        else if (m > 0 && n > 0){
            return(this.calculate(m-1, this.calculate(m, n-1)));
        }
        throw new IllegalArgumentException();
    }
}


class Ackermann2{
// need to implement equals and hashCode to use HashMap.contains() 
// hashCode to make hashes unique(ish) and equals to make contains() work
    private int m, n;
    private static Map<String, Integer> map; //shared field


    Ackermann2(int m, int n){
        this.m = m;
        this.n = n;
        if(map == null){
            map = new HashMap<String, Integer>(); // String key = m + " " + n
        }

    }

    @Override
    public int hashCode(){
        String s = m + " " + n;
        return s.hashCode();
    }

    @Override
    public boolean equals(Object object){
        if(object == null || object.getClass() != this.getClass()){
            return false;
        }

        Ackermann2 obj = (Ackermann2) object;

        if(this.m != obj.getM() || this.n != obj.getN()){
            return false;
        }

        return true;

    }


    public int getM(){
        return m;
    }


    public int getN(){
        return n;
    }

    public int calculate() throws IllegalArgumentException{
        String s = m + " " + n;
        if(this.map.containsKey(s)){
            return map.get(s);
        }

        int ans;//just so it's initialized

        if(m == 0){
            ans = n + 1;
        }

        else if(m > 0 && n == 0 ) {
            Ackermann2 ack = new Ackermann2(m-1, 1);
            ans = ack.calculate();
        }

        else if (m > 0 && n > 0){
            Ackermann2 a = new Ackermann2(m, n-1);
            int b = a.calculate();
            Ackermann2 ack = new Ackermann2(m-1, b);
            ans = ack.calculate();
        }
        else {
            throw new IllegalArgumentException();
        }


        map.put(s, ans);

        return ans;

    }
}


