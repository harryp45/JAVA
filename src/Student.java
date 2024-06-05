import java.util.Scanner;
//
public class Student {

    String FirstName;
    String LastName;
    String StudentID;
    int GradeYear;
    String Courses= "";
    int TuitionBalance = 0;
    int CostOfcourse= 600;
    static int id = 1000;
    static int CourseCost = 600;


    public void student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student first Name: ");
        this.FirstName = in.nextLine();

        System.out.println("Enter Student Last Name:  ");
        this.LastName = in.nextLine();

        System.out.println("1 - Freshman\n2 - Junior\n3 - Senior\n Enter student class level: ");

        this.GradeYear = in.nextInt();

        SetStudentId();

    }

    //generate student id
    public void SetStudentId() {
        this.StudentID = GradeYear + "" + id;
        id++;

    }

    // enroll in course
    public void enroll() {
        do {
            System.out.print("enter course to enroll (Q TO QUIT ): ");
            Scanner in = new Scanner(System.in);
            String Course = in.nextLine();
            if (!Course.equals("Q")) {
                 Courses = Courses + "\n" + Course;
                TuitionBalance = TuitionBalance + CostOfcourse;
            }
            else {

                break;
            }
        } while (1 != 0 );
        }
        // for view balance
        public void viewBalance(){
            System.out.println("Your Balance is : $"+TuitionBalance);
        }
        //pay tuition
        public void paytuition(){
            viewBalance();
            System.out.print("enter your payment: $");
            Scanner in = new Scanner(System.in);
            int payment = in.nextInt();
            TuitionBalance = TuitionBalance - payment;
            System.out.println("Thank You for your payment of $ " + payment);
            viewBalance();

        }
        //show status
        public  String  getStudentInfo() {
            return "Name: " + FirstName + "" + LastName +
                    "\nGrade Level "+ GradeYear+
                    "\nstudentID: "+ StudentID +
                    "\nCourses Enorllled: "+ Courses+
                      "\nBalance:$ "+TuitionBalance;
        }

    }
