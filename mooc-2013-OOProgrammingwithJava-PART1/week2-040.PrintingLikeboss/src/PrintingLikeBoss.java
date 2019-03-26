public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount)     
    {
        int i = 0;
        while (i < amount) {            
            System.out.print("*");  
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount)
    {
        int i = 0;
        while (i < amount) {            
            System.out.print(" ");  
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        int spaces;
        while(i <= size){
            spaces = size - i;
            printWhitespaces(spaces);
            printStars(i);
            i++;
        }
    }

    public static void xmasTree(int height) {
        int i = 0;
        int j = 0;
        int spaces;
        int totalSpaces;
        int stars;
        int width = ((2*(height - 1)) +1);
        int baseWidth = 3; //specified by exercise
        int baseSpaces = (width - baseWidth ) / 2;
        int baseHeight = 2; //specified by exercise
        while (i < height) 
        {
            stars = (2*i +1);            
            totalSpaces = (width - stars);
            spaces = totalSpaces / 2;
            printWhitespaces(spaces);
            printStars(stars);
            i++;
        }
        while (j < baseHeight) {            
            printWhitespaces(baseSpaces);
            printStars(baseWidth);
            j++;
        }

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
