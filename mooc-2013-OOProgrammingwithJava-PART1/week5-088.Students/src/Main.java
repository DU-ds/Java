
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        String tmpStudentNumber;
        String tmpStudentName ;
        
        
        while ( true)  
//collect student names and numbers 
        {
            System.out.print("name: ");
            tmpStudentName = scan.nextLine();
            if(tmpStudentName.equals("") ){
                break;
            }
                    
            System.out.print("studentnumber:");
            tmpStudentNumber = scan.nextLine();
            Student tmpStudent = new Student(tmpStudentName, tmpStudentNumber);
            students.add(tmpStudent);
            
            
        }
        studentPrint(students);

        
        
        System.out.print("Give search term: ");
        String searchTerm = scan.nextLine();
        ArrayList<Student> studentsSearch = new ArrayList<Student>();
        
        for (Student student : students) 
        {
            if(student.getName().contains(searchTerm))
            {
                studentsSearch.add(student);
            }
        }
        
        System.out.println("Result:");
        studentPrint(studentsSearch);
        
        
    }
    
        public static void studentPrint(ArrayList<Student> studentList)
    {
        for (Student student : studentList) 
            {
                System.out.println( student.toString() );
        }
    }

    
    
}
