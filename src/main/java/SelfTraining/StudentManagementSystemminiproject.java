package SelfTraining;
import java.util.*;
interface DatabaseOperations{
    void addPerson(person p);
    void viewAll();
    void searchById(int id);
    void deleteById(int id);
}
abstract class person{
    private int id;
    private String name;
    public person(int id, String name){
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public abstract void displayInfo();
}
class Student2 extends person{
    private String course;
    private String grade;
    public Student2(int id, String name, String course, String grade){
        super(id,name);
        this.course=course;
        this.grade=grade;
    }
    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course=course;
    }
    public String getGrade(){
        return grade;
    }
    public void setGrade(String grade){
        this.grade=grade;
    }
    public void displayInfo() {
        System.out.println("Student -> ID: " + getId() + " Name: " + getName() + " Course: " + course + " Grade: " + grade);
    }
    public void displayInfo(boolean showGrade){
        if(showGrade){
            displayInfo();
        }else{
            System.out.println("Student -> ID: " + getId()+" Name: " + getName() +" Course: " + course);
        }
    }
}
class Teacher extends person{
    private String subject;
    public Teacher(int id, String name, String subject){
        super(id,name);
        this.subject=subject;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
    public void displayInfo(){
        System.out.println("Teacher -> ID: " +getId() +" Name:"+ getName() +" Subject: "+ subject);
    }
}
class SchoolDatabase implements DatabaseOperations{
    private List<person> p1 =new ArrayList<>();
    public void addPerson(person p){
        p1.add(p);
        System.out.println("Added successfully!");
    }
    public void viewAll(){
        if(p1.isEmpty()){
            System.out.println("No records found");
            return;
        }
        for(person p:p1) {
            if (p instanceof Student2) {
                Student2 s= (Student2)p;
                System.out.println("---Basic Info------");
                s.displayInfo(false);
                System.out.println("---Full Info----");
                s.displayInfo(true);
            } else {
                p.displayInfo();
            }
            System.out.println();
        }
    }
    public void searchById(int id){
        for(person p: p1){
            if(p.getId()==id){
                p.displayInfo();
                return;
            }
        }
        System.out.println("Record not found!");
    }
    public void deleteById(int id){
        Iterator<person> it =p1.iterator();
        while(it.hasNext()){
            person p =it.next();
            if(p.getId()==id){
                it.remove();
                System.out.println("Record deleted successfully!");
                return;
            }
        }
        System.out.println("Record not found");
    }
}
public class StudentManagementSystemminiproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SchoolDatabase db = new SchoolDatabase();
        int choice;
        do{
            System.out.println("------Student Management System------");
            System.out.println("1.Add student:");
            System.out.println("2.Add Teacher:");
            System.out.println("3.view all records");
            System.out.println("4.Search by Id");
            System.out.println("5.Delete by id");
            System.out.println("6.Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter Student ID:");
                    int sid=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Student Name:");
                    String sname = sc.nextLine();
                    System.out.println("Enter Course:");
                    String scourse = sc.nextLine();
                    System.out.println("Enter Grade:");
                    String sgrade=sc.nextLine();
                    db.addPerson(new Student2(sid,sname,scourse,sgrade));
                    break;
                case 2:
                    System.out.println("Enter Teacher Id:");
                    int tid=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Teacher Name:");
                    String tname=sc.nextLine();
                    System.out.println("Enter Teacher Subject:");
                    String tsub = sc.nextLine();
                    db.addPerson(new Teacher(tid,tname,tsub));
                case 3: db.viewAll();
                        break;
                case 4:
                    System.out.println("Enter ID to search:");
                    int searchId=sc.nextInt();
                    db.searchById(searchId);
                    break;
                case 5:
                    System.out.println("Enter ID to delete:");
                    int deleteId=sc.nextInt();
                    db.deleteById(deleteId);
                    break;
                case 6:
                    System.out.println("Exiting Good bye..........");
                    break;
                case 7:
                    System.out.println("Invalid Option");
            }
        }while(choice!=6);
        sc.close();
    }

}
