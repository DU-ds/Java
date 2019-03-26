
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DU-ds
 */
public class Student {
    
    private String name;
    private String studentNumber;
    
    public Student(String name, String number){
        this.name = name;
        this.studentNumber = number;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getStudentNumber()
    {
        return this.studentNumber;
    }
    
    public String toString()
    {
        return this.name + " (" + this.studentNumber + ")";
    }
        
    public void studentPrint(ArrayList<Student> stu)
    {
        for (Student student : stu) 
            {
                System.out.println( student.toString() );
        }
    }
    
}
