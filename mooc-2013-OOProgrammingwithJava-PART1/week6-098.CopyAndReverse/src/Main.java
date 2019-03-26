

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);
        int[] reverse = reverseCopy(original);
    // change the copied
        copied[0] = 99;

    // print both
        System.out.println( "original: " + printElegantly(original));
        System.out.println( "copied: "   + printElegantly(copied));
        System.out.println( "reversed: " + printElegantly(reverse));
    }
    public static int[] copy(int[] array)
    {
        int[] arr = new int[array.length];
        for(int i = 0; i < array.length; i++)
        {
            arr[i] = array[i];
        }
        return arr;
    }
    public static int[] reverseCopy(int[] array)
    {
        int[] arr = new int[array.length];
        for(int i = 0; i < array.length; i++)
        {
            arr[i] = array[array.length - 1 - i];
        }
        return arr;
    }
    
    public static String printElegantly(int[] array) 
    {
        String tmp = "[";
        for (int i = 0; i < array.length - 1; i++)
        {
            tmp += array[i] + ", ";
        }
        tmp += array[array.length - 1] + "]";
        return tmp;
    }
}
