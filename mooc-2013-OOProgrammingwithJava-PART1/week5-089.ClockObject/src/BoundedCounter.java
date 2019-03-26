
public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        if (this.value < this.upperLimit)
        {
            value++;
        }
        else {
            this.value = 0;
        }
    }

    public String toString() {
        if(value >=10){
            return "" + value;
        }
        else{
            return "0" + value;
        }
    }
    public int getValue(){
        return this.value;
    }
    public void setValue(int val){
        if (val >= 0 && val <= this.upperLimit)
        {
            this.value = val;
        }
    }
    
}
  

