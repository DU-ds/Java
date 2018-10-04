
//objectPractice
class Shoes {

    private int sizeInCentemeters;
    private boolean shoesOn;
    private boolean shoesTied;
    private String shoeColor ;

    public Shoes() {
        shoesTied = false;
        shoesOn = false;
        shoeColor = "black";
        sizeInCentemeters = 25;
    }
    /** public Shoes(int c, String s, boolean o, boolean t)
     *  requires: nothing
     *  effects: created object of class Shoes with shoe.size() >= 0
     */
     public Shoes(int c, String s, boolean o, boolean t){
        if (c >= 0) {
           
       
        this.sizeInCentemeters = c;
        this.shoeColor = s;
        this.shoesOn = o;
        this.shoesTied = t;
        }
        else{ // maybe define recurively?
            this.sizeInCentemeters = -c;
            this.shoeColor = s;
            this.shoesOn = o;
            this.shoesTied = t;
       }  
       }
       /** public Shoes (int c, String s)
        *  requires: nothing
        *  effects: created object of class Shoes with shoe.size() >= 0
        */
    public Shoes (int c, String s){
        if (c >= 0) {
            this.sizeInCentemeters = c;
            this.shoeColor = s;
            this.shoesOn = false;
            this.shoesTied = false;
        }
        else {
            this.sizeInCentemeters = -c;
            this.shoeColor = s;
            this.shoesOn = false;
            this.shoesTied = false;
        }
    }

    // public Shoes(int c, String s, boolean o, boolean t){
    //     this.sizeInCentemeters = c;
    //     this.shoeColor = s;
    //     this.shoesOn = o;
    //     this.shoesTied = t;
    // }
    // public Shoes (int c, String s){
    //     this.sizeInCentemeters = c;
    //     this.shoeColor = s;
    //     this.shoesOn = false;
    //     this.shoesTied = false;
    // }
    /** public int getShoeSizeInCentemeters()
     * requires: nothing
     * effects: returns the size value of the Shoes object 
     */
    public int getShoeSizeInCentemeters(){
        int shoeSize;
        shoeSize = this.sizeInCentemeters;  // this doesn't leak out a reference to the private varaible right?
        return shoeSize;
    }
    /** public String getShoeColor()
    *  requires: nothing 
    *  effects: returns shoe objects color value
    */
    public String getShoeColor(){
        String color;
        color = this.shoeColor;
        return color;
    }
    /** public boolean getShoesOn() 
    *   requires: nothing
    *   effects: returns Shoes object is on or not on
    */

    public boolean getShoesOn(){
        boolean shoesAreOn;
        shoesAreOn = this.shoesOn;
        return shoesAreOn;
    }

    /** public boolean getShoesTied()
     *  requires: nothing
     *  effects:  returns Shoes object tied or not tied
     */
    public boolean getShoesTied(){
        boolean shoesAreTied;
        shoesAreTied = this.shoesTied;
        return shoesAreTied;
    }
    /** public void setShoesTied(boolean t)
     *  requires: nothing
     *  effects:  set Shoes tied attribute to value t
     */
    public void setShoesTied(boolean t){
        this.shoesTied = t;
    }
    /** public void setShoesOn( boolean t)
     *  requires: nothing
     *  effects:  sets Shoes object on to value t
     */
    public void setShoesOn( boolean t){
        this.shoesOn = t;
    }
    // I didn't add the others since you can't easily change size or color once you have shoes.

    public static void main(String[] args) {
        Shoes shoe1 = new Shoes(30, "blue", true, true);
        Shoes shoe2 = new Shoes();
        Shoes shoe3 = new Shoes(28, "green");
        System.out.println(shoe1.getShoeSizeInCentemeters());  //30
        System.out.println(shoe1.getShoesTied());             //true
        System.out.println(shoe3.getShoeColor());            //green
        System.out.println(shoe2.getShoesOn());             //false
        shoe2.setShoesOn(true);
        shoe2.setShoesTied(true);
        System.out.println(shoe2.getShoesOn());           //true       
        System.out.println(shoe2.getShoesTied());        //true 
    }



}