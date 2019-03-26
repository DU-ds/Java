/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DU-ds
 */
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
        int val = this.value;
        return val;
    }
    public void setValue(int val){
        if (val >= 0 && val <= this.upperLimit)
        {
            this.value = val;
        }
    }
    
}
  
