package SelfTraining;
import java.util.ArrayList;
import java.util.Scanner;
class Students{
    private int rollno;
    private String name;
    private String grade;
    private static int totalStudent=0;
    public Students(int rollno, String name, String grade ){
        this.rollno=rollno;
        this.name=name;
        this.grade=grade;
        totalStudent++;
    }
    public int getRollNo(){
        return rollno;
    }
    public String getName(){
        return name;
    }
    public String getGrade(){
        return grade;
    }
    public void setGrade(String grade){
        this.grade=grade;
    }
    public static int getTotalStudents(){
        return totalStudent;
    }
    public void displayInfo(){
        System.out.println("Roll No: "+rollno+ ", Name: "+name+ ", Grade: "+grade);
    }
}
public class StudentManagementSystem {
    private static ArrayList<Students> students = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("\n====Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.println("Enter your Choice: ");
            choice= sc.nextInt();
            switch(choice){
                case 1: addStudent();break;
                case 2:viewStudents();break;
                case 3:searchStudent();break;
                case 4:deleteStudent();break;
                case 5:
                    System.out.println("Exiting!....Good Bye"); break;
                default :
                    System.out.println("Invalid choice");
            }
        }while(choice !=5);
    }
    private static void addStudent(){
        System.out.println("Enter Roll No: ");
        int rollno=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name: ");
        String name=sc.nextLine();
        System.out.println("Enter Grade: ");
        String grade= sc.nextLine();
        students.add(new Students(rollno,name,grade));
        System.out.println("Students Successfully added! Total Students: "+Students.getTotalStudents());
    }
    private static void viewStudents(){
        if(students.isEmpty()){
            System.out.println("No Student Found!");
            return;
        }
        System.out.println("\n---Student List---");
        for(Students s :students){
            s.displayInfo();
        }
    }
    private static void searchStudent(){
        System.out.println("Enter rollno to search: ");
        int rollno=sc.nextInt();
        for(Students s:students){
            if(s.getRollNo()==rollno){
                s.displayInfo();
                return;
            }
        }
        System.out.println("Student not found!");
    }
    private static void deleteStudent(){
        System.out.println("Enter roll no to delete: ");
        int rollno=sc.nextInt();
        for(Students s: students){
            if(s.getRollNo()==rollno){
                students.remove(s);
                System.out.println("Student deleted successfully");
                return;
            }
        }
        System.out.println("Student not found!");
    }
}
