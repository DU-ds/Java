
/**
 *
 * @author DU-ds
 */
class Shoes2 {

    private int sizeInCentemeters;
    private String shoeColor ;
    private boolean shoesOn;
    private boolean shoesTied;

    public static class Shoes2Builder {

        private int sizeInCentemeters = 25;
        private String shoeColor = "black";
        private boolean shoesOn = false;
        private boolean shoesTied = false;

        public Shoes2Builder ( ) {
        }

        public Shoes2Builder sizeInCentemeters (int sizeInCentemeters ) {
            if ( sizeInCentemeters >= 0){
            this.sizeInCentemeters = sizeInCentemeters;
            }
            else{
                this.sizeInCentemeters = - sizeInCentemeters;  // ensures shoe size >= 0
            }
            return this;

        }
        public Shoes2Builder shoeColor ( String shoeColor){
            this.shoeColor = shoeColor;
            return this;
        }
        
        public Shoes2Builder shoesOn (boolean shoesOn){
            this.shoesOn = shoesOn;
            return this;
        }
        public Shoes2Builder shoesTied ( boolean shoesTied){
            this.shoesTied = shoesTied;
            return this;
        }
        public Shoes2 build(){
            return new Shoes2(this);
            
        }

    }










    private Shoes2(Shoes2Builder shoesBuilder ) {
        sizeInCentemeters = shoesBuilder.sizeInCentemeters;
        shoeColor = shoesBuilder.shoeColor;
        shoesOn = shoesBuilder.shoesOn;
        shoesTied = shoesBuilder.shoesTied;
    }






//getter methods



    /** public int getShoeSizeInCentemeters()
     * requires: nothing
     * effects: returns the size value of the Shoes2 object 
     */
    public int getShoeSizeInCentemeters(){
        int shoeSize;
        shoeSize = this.sizeInCentemeters;  // this doesn't leak out a reference to the private varaible right?
        return shoeSize;
    }
     /** private String getShoeColor()
    *  requires: nothing 
    *  effects: returns shoe2 objects color value
    */
    public String getShoeColor(){
        String color;
        color = this.shoeColor;
        return color;
    }
    /** private boolean getShoes2On() 
    *   requires: nothing
    *   effects: returns Shoes2 object is on or not on
    */
    public boolean getShoes2On(){
        boolean shoesAreOn;
        shoesAreOn = this.shoesOn;
        return shoesAreOn;
    }
    /** private boolean getShoes2Tied()
     *  requires: nothing
     *  effects:  returns Shoes2 object tied or not tied
     */
    public boolean getShoes2Tied(){
        boolean shoesAreTied;
        shoesAreTied = this.shoesTied;
        return shoesAreTied;
    }
     /** private void setShoes2Tied(boolean t)
     *  requires: nothing
     *  effects:  set Shoes2 tied attribute to value t
     */









//setter methods



    public void setShoes2Tied(boolean t){
        this.shoesTied = t;
    }
    /** private void setShoes2On( boolean t)
     *  requires: nothing
     *  effects:  sets Shoes2 object on to value t
     */
    public void setShoes2On( boolean t){
        this.shoesOn = t;
    }





   public static void main(String[] args) {
        Shoes2 shoe1 = new Shoes2.Shoes2Builder().sizeInCentemeters(30).shoeColor("blue").shoesOn(true).shoesTied(true).build();
        Shoes2 shoe2 = new Shoes2.Shoes2Builder().build();
        Shoes2 shoe3 = new Shoes2.Shoes2Builder().sizeInCentemeters(28).shoeColor("green").build();
        System.out.println(shoe1.getShoeSizeInCentemeters());  //30
        System.out.println(shoe1.getShoes2Tied());             //true
        System.out.println(shoe3.getShoeColor());            //green
        System.out.println(shoe2.getShoes2On());             //false
        shoe2.setShoes2On(true);
        shoe2.setShoes2Tied(true);
        System.out.println(shoe2.getShoes2On());           //true       
        System.out.println(shoe2.getShoes2Tied());        //true 
    }



}