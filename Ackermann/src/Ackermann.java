/**
 *
 * @author DU-ds
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
            System.out.println("Ack2(3,3): " + a);
        }
        catch(Exception e) {
            System.err.println("Exception: " + e);
        }
        

//        try{
//            Ackermann2 ack9 = new Ackermann2(4,1);
//            int a = ack9.calculate();
//            System.out.println("Ack2(4,1): " + a);
//        }
//        catch(Exception e){
//            System.err.println("Exception: " + e);
//        }
//        catch(Error err){
//            System.err.println("Error: " + err);
//        }
    
// StackOverflow Errors

//        try{
//            Ackermann2 ack9 = new Ackermann2(4,1);
//                int a = ack9.calculate();
//                System.out.println("Ack2(4,1): " + a);
//        }
//        catch(Exception e){
//            System.err.println("Exception: " + e);
//        }
//        catch(Error err){
//            System.err.println("Error: " + err);
//        }
    }
}

