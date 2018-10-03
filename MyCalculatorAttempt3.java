import javax.swing.*;
import java.awt.*;
 
public class MyCalculatorAttempt3 {
    JFrame frame;//Creating object of JFrame class
    Calculator()//Creating constructor of the class
    {
        prepareGUI();
    }
    public void prepareGUI()
    {
        frame=new JFrame();
        frame.setTitle("Calculator");//Setting title of the JFrame
        frame.setSize(300,440);//Setting size
        frame.getContentPane().setLayout(null);//Setting Layout
        frame.getContentPane().setBackground(Color.black);//Setting Background Color
        frame.setResizable(false);//Preventing window from resizing
        frame.setLocationRelativeTo(null);//Setting location to the center of the screen
        frame.setVisible(true);//Setting window's visibility
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Setting default close operation
    }
}
public class MainClass {
    public static void main(String[] args)
    {
            new Calculator();
    }
}