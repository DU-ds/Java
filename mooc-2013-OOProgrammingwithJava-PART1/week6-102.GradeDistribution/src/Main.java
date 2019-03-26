import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        int grade;
        Distribution distr = new Distribution();
        
        while (true) 
        {            
            input = Integer.parseInt(scan.nextLine());
            if (input == -1)
            {
                break;
            }
            grade = Grader.grader(input);
            distr.update(grade);
        }
        DistributionPrint.distributionPrint(distr);
        
        
        
        
    }
}
