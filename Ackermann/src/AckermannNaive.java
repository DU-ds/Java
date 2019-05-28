/**
 *
 * @author DU-ds
 */
public class AckermannNaive{
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