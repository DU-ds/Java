
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added)
    {
        int euro;
        euro = this.euros + added.euros;
        int cent;
        if ( this.cents + added.cents >= 100) 
        { //assuming the cent inputs will be in the range [0 - 99]
            euro++;
        }
        cent = (this.cents + added.cents )  %  100;
        return new Money(euro, cent);
    }
    
    public boolean less(Money compared)
    {
        if (this.euros < compared.euros)
        {
            return true;
        }
        else if (this.euros > compared.euros)
        {
            return false;
        }
       
        else return this.cents < compared.cents;
    }
        public Money minus(Money decremented)
        {
            int cent = this.cents - decremented.cents ;
            int euro = this.euros - decremented.euros;
            if( cent < 0)
            {
                cent = (100 + cent);
                euro--;
            }
            
            
            if (euro >= 0)
            {
                return new Money (euro, cent);
            }
            
            else if ( euro < 0  || cent == 0)
            {
                return new Money(0,0);
            }
            return new Money(euro, cent);
            
            
        }
        
            
}
