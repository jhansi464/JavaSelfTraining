package studentmanagementsystemupdated;

import java.util.Scanner;

public class Studentmanagementsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SchoolDatabase db = new SchoolDatabase();
        int choice;

        do {
            System.out.println("\n------Student Management System------");
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
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: "); int sid = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Name: "); String sname = sc.nextLine();
                    System.out.print("Enter Course: "); String scourse = sc.nextLine();
                    System.out.print("Enter Grade: "); String sgrade = sc.nextLine();
                    System.out.print("Enter Interested Domain: "); String domain = sc.nextLine();
                    System.out.print("Enter Favorite Subject: "); String favSub = sc.nextLine();
                    db.addPerson(new Student(sid, sname, scourse, sgrade, domain, favSub));
                    break;

                case 2:
                    System.out.print("Enter Teacher ID: "); int tid = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Name: "); String tname = sc.nextLine();
                    System.out.print("Enter Subject: "); String tsub = sc.nextLine();
                    System.out.print("Enter Email: "); String email = sc.nextLine();
                    System.out.print("Enter Department: "); String dept = sc.nextLine();
                    db.addPerson(new Teacher(tid, tname, tsub, email, dept));
                    break;

                case 3: db.viewAll(); break;

                case 4:
                    System.out.print("Enter ID to search: "); int searchId = sc.nextInt(); sc.nextLine();
                    db.searchById(searchId); break;

                case 5:
                    System.out.print("Enter ID to delete: "); int deleteId = sc.nextInt(); sc.nextLine();
                    db.deleteById(deleteId); break;

                case 6:
                    System.out.print("Enter Student ID to update: "); int updateSid = sc.nextInt(); sc.nextLine();
                    db.updateStudent(updateSid, sc); break;

                case 7:
                    System.out.print("Enter Teacher ID to update: "); int updateTid = sc.nextInt(); sc.nextLine();
                    db.updateTeacher(updateTid, sc); break;

                case 8:
                    System.out.print("Enter Student ID: "); int assignSid = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Teacher ID: "); int assignTid = sc.nextInt(); sc.nextLine();
                    db.assignTeacherToStudent(assignSid, assignTid); break;

                case 9: System.out.println("Goodbye!"); break;

                default: System.out.println("Invalid option!"); break;
            }
        } while (choice != 9);

        sc.close();
    }
}
