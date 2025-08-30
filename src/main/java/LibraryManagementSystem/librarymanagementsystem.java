package LibraryManagementSystem;
import java.util.*;
public class librarymanagementsystem {
    public static void main(String[] args) {
        Library library=new Library();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("---------LibraryManagementSystem---------");
            System.out.println("1. Add Book");
            System.out.println("2. view All book");
            System.out.println("3. Register Member");
            System.out.println("4. view All member");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. view Issued Books");
            System.out.println("8. Save & Exit");
            System.out.println("Enter your choice:");
            int choice =sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter Book ID:");
                    int bookId=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Title:");
                    String title=sc.nextLine();
                    System.out.println("Enter Author:");
                    String author=sc.nextLine();
                    System.out.println("Enter Quantity:");
                    int quantity =sc.nextInt();
                    sc.nextLine();
                    library.addBook(new Book(bookId,title,author,quantity));
                    break;
                case 2:
                    library.viewAllBooks();
                    break;
                case 3:
                    System.out.println("Enter Member ID:");
                    int memID=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name:");
                    String name=sc.nextLine();
                    System.out.println("Enter Contact:");
                    String contact =sc.nextLine();
                    library.registerMember(new Member(memID,name,contact));
                    break;
                case 4:
                    library.viewAllMembers();
                    break;
                case 5:
                    System.out.println("Enter Book ID to issue:");
                    int issueBookID= sc.nextInt();
                    System.out.println("Enter Member ID");
                    int issueMemberID= sc.nextInt();
                    library.issueBook(issueBookID,issueMemberID);
                    break;
                case 6:
                    System.out.println("Enter Book Id to return:");
                    int retunBookId= sc.nextInt();
                    System.out.println("Enter Member ID:");
                    int returnmemberId= sc.nextInt();
                    library.returnBook(retunBookId,returnmemberId);
                    break;
                case 7:
                    library.viewIssuedBooks();
                    break;
                case 8:
                    library.saveData();
                    System.out.println("Exiting Good bye!!!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Chooice!!! Try again");
            }
        }
    }
}
