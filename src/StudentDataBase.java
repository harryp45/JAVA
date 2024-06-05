import java.util.Scanner;

public class StudentDataBase {
    public static void main(String[] args) {
        Student stul = new Student();
        stul.student();
        stul.enroll();
        stul.paytuition();
        System.out.println(stul.getStudentInfo()); // Print the result of toString method call
        
    }
}
