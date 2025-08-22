package SelfTraining;
import java.util.*;
import java.util.*;

// 🔹 Interface
interface DatabaseOperations {
    void addPerson(Person p);
    void viewAll();
    void searchById(int id);
    void deleteById(int id);
    void updateStudent(int id, Scanner sc);
    void updateTeacher(int id, Scanner sc);
    void assignTeacherToStudent(int sid, int tid);
}

// 🔹 Abstract Class
abstract class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void displayInfo();
}

// 🔹 Student Class
class Student2 extends Person {
    private String course;
    private String grade;
    private Teacher teacher; // assigned teacher

    public Student2(int id, String name, String course, String grade) {
        super(id, name);
        this.course = course;
        this.grade = grade;
    }

    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void assignTeacher(Teacher t) {
        this.teacher = t;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public void displayInfo() {
        System.out.print("Student -> ID: " + getId() + " Name: " + getName() +
                " Course: " + course + " Grade: " + grade);
        if (teacher != null) {
            System.out.print(" | Assigned Teacher: " + teacher.getName());
        }
        System.out.println();
    }

    public void displayInfo(boolean showGrade) {
        if (showGrade) {
            displayInfo();
        } else {
            System.out.print("Student -> ID: " + getId() + " Name: " + getName() +
                    " Course: " + course);
            if (teacher != null) {
                System.out.print(" | Assigned Teacher: " + teacher.getName());
            }
            System.out.println();
        }
    }
}

// 🔹 Teacher Class
class Teacher extends Person {
    private String subject;

    public Teacher(int id, String name, String subject) {
        super(id, name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher -> ID: " + getId() + " Name: " + getName() +
                " Subject: " + subject);
    }
}

// 🔹 Database Class
class SchoolDatabase implements DatabaseOperations {
    private List<Person> p1 = new ArrayList<>();

    public void addPerson(Person p) {
        p1.add(p);
        System.out.println("Added successfully!");
    }

    public void viewAll() {
        if (p1.isEmpty()) {
            System.out.println("No records found");
            return;
        }
        for (Person p : p1) {
            if (p instanceof Student2) {
                Student2 s = (Student2) p;
                System.out.println("--- Basic Info ---");
                s.displayInfo(false);
                System.out.println("--- Full Info ---");
                s.displayInfo(true);
            } else {
                p.displayInfo();
            }
            System.out.println();
        }
    }

    public void searchById(int id) {
        for (Person p : p1) {
            if (p.getId() == id) {
                p.displayInfo();
                return;
            }
        }
        System.out.println("Record not found!");
    }

    public void deleteById(int id) {
        Iterator<Person> it = p1.iterator();
        while (it.hasNext()) {
            Person p = it.next();
            if (p.getId() == id) {
                it.remove();
                System.out.println("Record deleted successfully!");
                return;
            }
        }
        System.out.println("⚠️ Record not found!");
    }

    public void updateStudent(int id, Scanner sc) {
        for (Person p : p1) {
            if (p.getId() == id && p instanceof Student2) {
                Student2 s = (Student2) p;
                System.out.println("Enter new name: ");
                s.setName(sc.nextLine());
                System.out.println("Enter new course: ");
                s.setCourse(sc.nextLine());
                System.out.println("Enter new grade: ");
                s.setGrade(sc.nextLine());
                System.out.println("Student details updated successfully");
                return;
            }
        }
        System.out.println("Student not found with ID: " + id);
    }

    public void updateTeacher(int id, Scanner sc) {
        for (Person p : p1) {
            if (p.getId() == id && p instanceof Teacher) {
                Teacher t = (Teacher) p;
                System.out.println("Enter new name: ");
                t.setName(sc.nextLine());
                System.out.println("Enter new subject: ");
                t.setSubject(sc.nextLine());
                System.out.println("Teacher details updated successfully");
                return;
            }
        }
        System.out.println("Teacher not found with ID: " + id);
    }

    public void assignTeacherToStudent(int sid, int tid) {
        Student2 student = null;
        Teacher teacher = null;

        for (Person p : p1) {
            if (p.getId() == sid && p instanceof Student2) {
                student = (Student2) p;
            } else if (p.getId() == tid && p instanceof Teacher) {
                teacher = (Teacher) p;
            }
        }

        if (student != null && teacher != null) {
            student.assignTeacher(teacher);
            System.out.println("Teacher " + teacher.getName() +
                    " assigned to Student " + student.getName());
        } else {
            System.out.println("Either Student or Teacher not found!");
        }
    }
}

// 🔹 Main Class
public class StudentManagementSystemminiproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SchoolDatabase db = new SchoolDatabase();
        int choice;

        do {
            System.out.println("\n------ Student Management System ------");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. View All Records");
            System.out.println("4. Search by ID");
            System.out.println("5. Delete by ID");
            System.out.println("6. Update Student Details");
            System.out.println("7. Update Teacher Details");
            System.out.println("8. Assign Teacher to Student");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter Student ID:");
                    int sid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Student Name:");
                    String sname = sc.nextLine();
                    System.out.println("Enter Course:");
                    String scourse = sc.nextLine();
                    System.out.println("Enter Grade:");
                    String sgrade = sc.nextLine();
                    db.addPerson(new Student2(sid, sname, scourse, sgrade));
                    break;

                case 2:
                    System.out.println("Enter Teacher ID:");
                    int tid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Teacher Name:");
                    String tname = sc.nextLine();
                    System.out.println("Enter Teacher Subject:");
                    String tsub = sc.nextLine();
                    db.addPerson(new Teacher(tid, tname, tsub));
                    break;

                case 3:
                    db.viewAll();
                    break;

                case 4:
                    System.out.println("Enter ID to search:");
                    int searchId = sc.nextInt();
                    db.searchById(searchId);
                    break;

                case 5:
                    System.out.println("Enter ID to delete:");
                    int deleteId = sc.nextInt();
                    db.deleteById(deleteId);
                    break;

                case 6:
                    System.out.println("Enter Student ID to update:");
                    int updatesid = sc.nextInt();
                    sc.nextLine();
                    db.updateStudent(updatesid, sc);
                    break;

                case 7:
                    System.out.println("Enter Teacher ID to update:");
                    int updatetid = sc.nextInt();
                    sc.nextLine();
                    db.updateTeacher(updatetid, sc);
                    break;

                case 8:
                    System.out.println("Enter Student ID:");
                    int stid = sc.nextInt();
                    System.out.println("Enter Teacher ID:");
                    int tchid = sc.nextInt();
                    db.assignTeacherToStudent(stid, tchid);
                    break;

                case 9:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid Option, try again!");
            }
        } while (choice != 9);

        sc.close();
    }
}
