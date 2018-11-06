import javax.wing.*;
import java.awt.*;

public Class Calculator extends javax.swing.JFrame {
    JFrame jframe; // 
    // object of class JFrame
    Calculator() 
    //calculator class constructor
    {
        beginGUI();
    }

    public void beginGUI(){
        jframe = new JFrame(); 
        jframe.setTitle("Calculator");
        jframe.setSize(300, 450);
        jframe.getContentPane().setLayout(null);
        jframe.getContentPane().setBackground(Color.blue);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
public class MainCLass {
    public static void main(String[] args)
    {
        new Calculator(); // main just creates the calculator
    }
}