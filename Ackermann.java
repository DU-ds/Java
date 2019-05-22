
import java.util.Map;
import java.util.HashMap;


/*
The Most Difficult Program to Compute? - Computerphile
https://www.youtube.com/watch?v=i7sm9dzFtEI&t=8s
*/

public Class Ackermann {

public static void main(String[] args) {
    AckermannNaive ack1 = new AckermannNaive();
    try{
        int a = ack1.calculate(2,3);
    }
    catch(StackOverflowError err) {
        System.err.println("Error: " + err);
    }
}

}cd 

public Class AckermannNaive{
    private int m, n;


    AckermannNaive(){
        // this.n = n;
        // this.m = m;
    }


    public int calculate(int m, int n){
        if(m == 0){
            return n + 1;
        }
        else if(m > 0 && n == 0 ) {
            return(this.calculate(m - 1, 1));
        }
        else if (m > 0 && n > 0){
            return(this.calculate(m-1, this.calculate(m, n-1)))
        }
    }
}


public Class Ackermann2{
// need to implement equals and hashCode to use HashMap.contains() 
// hashCode to make hashes unique(ish) and equals to make contains() work
    private int m, n;
    private static Map<Integer,Integer> map; //shared field


    Ackermann2(int m, int n){
        this.m = m;
        this.n = n;
        if(map == null){
            map = new HashMap<String, Integer>() // String key = m + " " + n
        }
    }


    public boolean equals(Object object){
        if(object == null || object.getClass() != this.getClass()){
            return false;
        }

        Ackermann2 obj = (Ackermann2) object;

        else if(this.m != obj.getM() || this.n != obj.getN){
            return false;
        }

        return true;

    }


    public int getM(){
        Integer l = new Integer(m);
        return l;
    }


    public int getN(){
        Integer l = new Integer(n);
        return l;
    }

    public int calculate(){
        if()


        // if(m == 0){
        //     return n + 1;
        // }
        // else if(m > 0 && n == 0 ) {
        //     return(this.calculate(m - 1, 1));
        // }
        // else if (m > 0 && n > 0){
        //     return(this.calculate(m-1, this.calculate(m, n-1)))
        // }
    }
}


// Need to 