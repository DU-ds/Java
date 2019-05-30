

public class HeapArray{
    T[] arr;
    int n = 1; //size of array


    public HeapArray<T>(){
        //set up array
        arr = T[n];

    }

    int left(int i)
    {
        return (2 * i) + 1;
    }

    int right(int i)
    {
        return 2 * (i + 1);
    }

    int parent(int i)
    {
        return (i - 1) / 2;
    }

    public void add(x)
    {
        if (i < 0 || i > n) throw new IndexOutOfBoundsException();
        if(n > arr.length)
        {
            arr[n] = x;
            n++;
        }
        else
        {
            this.resize();
            arr[n] = x;
            n++;
        }
    }

    public void remove(x)
    {

    }

    private resize()
    {
        if(arr.length == n)
        {
            T[] bar = new T[2*n ]
            for(int i = 0; i < arr.length; i++)
            {
                bar[i] = arr[i];
            }
        }

        else if(bar.length <= Math.sqrt(n)/Math.log(2) )
        {
            T[] bar = new T[n/2 + 1]//plus one to handle edge case
            for(int i = 0; i < bar.length; i++)
            {
                bar[i] = arr[i];
            }
        }
    }
}