
public class CashRegister {

    private double cashInRegister;
    private int economicalSold = 0;
    private int gourmetSold = 0;

    
    public CashRegister() {
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= 2.5)
        {
            this.cashInRegister += 2.5;
            this.economicalSold++;
            return cashGiven - 2.5;
        }
        else
        {
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        
        if (cashGiven >= 4){
            this.cashInRegister += 4;
            this.gourmetSold++;
            return cashGiven - 4;
        }
        else
        {
            return cashGiven;
        }
    }
    
    public boolean payEconomical(LyyraCard card)
    {
        if (card.balance() >= 2.5)
        {
            this.economicalSold++;
            card.pay(2.5);
            return true;
        }
        else 
        {
            return false;
        }
    }
    public boolean payGourmet(LyyraCard card)
    {
        if (card.balance() >= 4)
        {
            this.gourmetSold++;
            card.pay(4);
            return true;
        }
        else 
        {
            return false;
        }
     }
     
    public void loadMoneyToCard(LyyraCard card, double sum)
    {
        if(sum > 0) 
        {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
        
    } 
     
    


    public String toString() {
        return "money in register " + this.cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }




}
