
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        for (int i : array) {
            printStars(i);
        }
    }
    
    public static void printStars(int e)
    {
        int i = 0;
        while(i < e)
        {
            System.out.print("*");
            i++;
        }
        System.out.println(); // new line
    }
}
