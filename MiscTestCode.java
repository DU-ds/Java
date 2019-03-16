/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misctestcode;

/**
 *
 * @author du_ds
 */
public class MiscTestCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 2 << 1;
        System.out.println(a);
        int[] A ;
        A = new int[a];
        System.out.println(A.length);
        
        for(int i = 0; i < 33; i++)
        {
            a = 2 << i;
            System.out.println("Bit Shifting Powers of 2: " + a);
        }
    }
    



   /*
    public int sqrtPrint(int x)
    {
        int rp = (int) log2(x);
        int upgrade = 
    

}
*/

    public double log2(double x)
    {
        return Math.log(x) / Math.log(2);
    }
}