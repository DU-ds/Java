
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate)
    {
        if (comparedDate.earlier(this))
        {
            int yearDiff = (this.year - comparedDate.year);
            if( comparedDate.month < this.month )
            {
                return yearDiff;
            }
            else if (comparedDate.month == this.month 
                    && comparedDate.day <= this.day )
            {
                return yearDiff;
            }
            
            
            return yearDiff - 1;
        }
        else if(this.earlier(comparedDate))
        {
            return comparedDate.differenceInYears(this);
        }
// will only be reached if the same day is entered twice!
        return 0; 
    }
    
    


  
}
