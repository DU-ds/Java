/**
 *
 * @author DU-ds
 */

import java.util.Map;
import java.util.HashMap;

public class Ackermann2 {
// need to implement equals and hashCode to use HashMap.contains() 
// hashCode to make hashes unique(ish) and equals to make contains() work
    private int m, n;
    private static Map<String, Integer> map; //shared field


    Ackermann2(int m, int n){
        this.m = m;
        this.n = n;
        if(map == null){
            map = new HashMap<String, Integer>(); // String key = m + " " + n
        }

    }

    @Override
    public int hashCode(){
        String s = m + " " + n;
        return s.hashCode();
    }

    @Override
    public boolean equals(Object object){
        if(object == null || object.getClass() != this.getClass()){
            return false;
        }

        Ackermann2 obj = (Ackermann2) object;

        if(this.m != obj.getM() || this.n != obj.getN()){
            return false;
        }

        return true;

    }


    public int getM(){
        return m;
    }


    public int getN(){
        return n;
    }

    public int calculate() throws IllegalArgumentException{
        String s = m + " " + n;
        if(map.containsKey(s)){
            return map.get(s);
        }

        int ans;//just so it's initialized

        if(m == 0){
            ans = n + 1;
        }

        else if(m > 0 && n == 0 ) {
            Ackermann2 ack = new Ackermann2(m-1, 1);
            ans = ack.calculate();
        }

        else if (m > 0 && n > 0){
            Ackermann2 a = new Ackermann2(m, n-1);
            int b = a.calculate();
            Ackermann2 ack = new Ackermann2(m-1, b);
            ans = ack.calculate();
        }
        else {
            throw new IllegalArgumentException();
        }


        map.put(s, ans);

        return ans;

    }
}

