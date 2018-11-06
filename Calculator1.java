

public class Calculator1 {
    
    private static double addDouble(double a, double b){
        double c = a + b;
        return c;
    }
    private static double subtractDouble(double a, double b) {
        double c = a - b;
        return c;
    }
    private static double multiplyDouble( double a, double b){
        double c = a * b;
        return c;
    }
    private static double divideDouble(double a, double b){
        double c = a / b;
        return c;
    }
/*    
    private int addInt(int a, int b){
        int c = a + b;
        return c; 
    }
    private int subtractInt(int a, int b){
        int c = a - b;
        return c;
    }
    private int multiplyInt(int a, int b){
        int c = a * b;
        return c;
    }
    private int divideInt(int a, int b){
        int c = a/b;
        return c;
    }*/
    // for now, just 4 funtion calculaor

    private static int Done = 0;

    public static void main(String[] args) {
        //System.out.println("Enter a 0 for Integer operations, a 1 for real number opperations")  // decided not to impliment int
        Scanner uInput = new Scanner(System.in); 
        while (Done == 0){
            System.out.println("Enter 1 to add, 2 to subtract, 3 to multiply, or 4 to divide");
            int operation = uInput.nextInt();

            switch(operation){
                case 1 : System.out.println("Ok, what's the first number you want to add?  e.g. 3.14");
                double A1 = uInput.nextDouble();
                System.out.println("What's the second number?");
                double B1 = uInput.nextDouble();
                double sum = addDouble ( A1, B1);
                System.out.println( A1 + " + " + B1 + " = " + sum);
                break;
                
                case 2: System.out.println("What's the number you want to subtract from? e.g. 4.0 ");
                double A2 = uInput.nextDouble();
                System.out.println("What's the number you want to subtract from" + A2);
                double B2 = uInput.nextDouble();
                double diff = subtractDouble( A2, B2);
                System.out.println( A2 + " - " + B2 + " = " + diff);
                break;

                case 3: System.out.println("What's the first number you want to multiply? e.g. 2.71");
                double A3 = uInput.nextDouble();
                System.out.println("What's the second number you want to multiply?");
                double B3 = uInput.nextDouble();
                double product = multiplyDouble(A3, B3);
                System.out.println(A3 + " * " + B3 + " = " + product);
                break;

                case 4: System.out.println("Enter the denominator:");
                double A4 = uInput.nextDouble();
                System.out.println("Enter the numerator:");
                double B4 = uInput.nextDouble();
                double ratExpression = divideDouble(A4, B4);
                System.out.println(A4 + " / " + B4 + " = " + ratExpression);
                break;
            }
            System.out.println("Are you done? Enter a 1 if you are. Otherwise, enter a 0");
            Done = uInput.nextInt();



        }
    }
}