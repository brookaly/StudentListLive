package studentlistlive;

/**
 *This class creates a list of students
 * @author alyssabrooks
 */
public class StudentListLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Student[] studentList = new Student[5];
        Student liz = new Student("Liz");
        studentList[0] = liz;
//        System.out.println(studentList[0].getStudentID());
        studentList[1] = new Student("Lyss");
//        System.out.println(studentList[1]);
        
        studentList[2] = new Student("Nadia");
        studentList[3] = new Student("Markus");
        studentList[4] = new Student("Sean");
        
        for(Student s: studentList)
        {
            System.out.println(s.getName());
        }
                
    }
    
}
