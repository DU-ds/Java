

public class IndexError
{


    public static void main(String[] args) 
    {
        int n = 10;
        int [] arr = {0,1,2,3,4,5,6,7,8,9};
 

        for (int j = 0; j < (n +1); j++ )  // expection thrown b/c last iteration of loop is out of bounds
        {
            arr[j] = j; 
            System.out.println(arr[j]);
        }
    }
}