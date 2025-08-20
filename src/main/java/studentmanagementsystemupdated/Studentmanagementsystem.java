package studentmanagementsystemupdated;

import java.util.Scanner;

public class Studentmanagementsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SchoolDatabase db = new SchoolDatabase();
        int choice;
        do{
            System.out.println("Student management system");
            System.out.println("1.Add person");
            System.out.println("2.Add Teacher");
            System.out.println("3.view All");
            System.out.println("4.Search by id");
            System.out.println("5.delete by id");
            System.out.println("6.Exit");
            System.out.println("Enter your choice:");
            choice =sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter Student ID:");
                    int sid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name");
                    String sname=sc.nextLine();
                    System.out.println("Enter course:");
                    String scourse = sc.nextLine();
                    System.out.println("Enter Grade:");
                    String sgrade = sc.nextLine();
                    System.out.println("Enter favourite subject:");
                    String fav = sc.nextLine();
                    System.out.println("Enter Intrested Domain:");
                    String sintrestedDomain=sc.nextLine();
                    db.addPerson(new Student(sid,sname,scourse,sgrade,fav,sintrestedDomain));
                    break;
                case 2:
                    System.out.println("Enter Teacher Id:");
                    int tid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name:");
                    String tname=sc.nextLine();
                    System.out.println("Enter Subject:");
                    String tsubject = sc.nextLine();
                    System.out.println("Enter mail Id:");
                    String tmail =sc.nextLine();
                    System.out.println("Enter Department:");
                    String tdepartment = sc.nextLine();
                    db.addPerson(new Teacher(tid,tname,tsubject,tmail,tdepartment));
                    break;
                case 3:  db.viewAll();
                    break;
                case 4:
                    System.out.println("Enter ID to search:");
                    int searchId=sc.nextInt();
                    db.searchById(searchId);
                    break;
                case 5:
                    System.out.println("Enter id to delete:");
                    int deleteId=sc.nextInt();
                    db.deleteById(deleteId);
                    break;
                case 6:
                    System.out.println("Exiting Good Byee.....");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
        while(choice!=6);
        sc.close();
    }
}
