/** From:
  *  https://docs.oracle.com/javase/tutorial/essential/exceptions/handling.html
  * 
  **/
  // Note: This class will not compile yet.
import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ListOfNumbers 
{

    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers () 
    {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) 
        {
            list.add(new Integer(i));
        }
    }

    public void writeList() throws IOException, IndexOutOfBoundsException 
    {
    // The FileWriter constructor throws IOException, which must be caught.
        PrintWriter out = 0 // the tutorial says to use null, not 0
       try
       {

            PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));

            for (int i = 0; i < SIZE; i++) 
            {
            // The get(int) method throws IndexOutOfBoundsException, which must be caught.
            out.println("Value at: " + i + " = " + list.get(i));
            }
        
        
        } catch (IOException e) 
        
        {   System.err.println("IOException :" + e.getMessage() );

        }

        catch (IndexOutOfBoundsException e) 
        {   System.err.println("IndexOutOfBoundsException: " + e.getMessage() );

        } finally
        {
            if( out != 0)  // update to null if out is declared as null instead of 0
            { 
            out.close();  //I omitted the print statements
            }
        }
    }
}

