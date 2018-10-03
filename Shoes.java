
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
    public Shoes(int c, String s, boolean o, boolean t){
        this.sizeInCentemeters = c;
        this.shoeColor = s;
        this.shoesOn = o;
        this.shoesTied = t;
    }
    public Shoes (int c, String s){
        this.sizeInCentemeters = c;
        this.shoeColor = s;
        this.shoesOn = false;
        this.shoesTied = false;
    }
    public int getShoeSizeInCentemeters(){
        int shoeSize;
        shoeSize = this.sizeInCentemeters;
        return shoeSize;
    }

    public static void main(String[] args) {
        Shoes shoe1 = new Shoes(30, "blue", true, true);
        Shoes shoe2 = new Shoes();
        Shoes shoe3 = new Shoes(28, "green");
        System.out.println(shoe1.getShoeSizeInCentemeters());
        
    }

}