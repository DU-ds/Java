
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {9,8,7,6,5,4,3,2,1,0};
        sort(values);
    }

    
    
    public static int smallest(int[] array)
    {
        int min = array[0];
        
        
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] < min)
            {
                min = array[i];
            }
        }
        
        
        return min;
    }
    
    
    public static int indexOfTheSmallest(int[] array)
    {
        int min = array[0];
        int index = 0;
        
        
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] < min)
            {
                min = array[i];
                index = i;
            }
        }
        
        
        return index;
    }
    
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index)
    {
        int min = array[index];
        
        
        for(int i = index + 1; i < array.length; i++)
        {
            if(array[i] < min)
            {
                min = array[i];
                index = i;
            }
        }
        
        
        return index;
    }
    
    
    public static void swap(int[] array, int index1, int index2)
    {
//        int temp = array;
        int val1 = array[index1];
        //int val2 = array[index2];
        
        
        array[index1] = array[index2];
        array[index2] = val1;
    }
    
    
    public static void sort(int[] array)
    {
        int minIndex;
        int minVal;
        System.out.println(Arrays.toString(array));
        
        
        for(int i = 0; i < array.length; i++)
        {
            minIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, minIndex);
            System.out.println(Arrays.toString(array));
        }
    }

}
