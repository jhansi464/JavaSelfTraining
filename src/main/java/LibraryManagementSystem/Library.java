package LibraryManagementSystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    private static final String BOOKS_FILE = "books.dat";
    private static final String MEMBERS_FILE = "members.dat";

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        loadData();
    }

    // ------------------- BOOK METHODS -------------------
    public void addBook(Book book) {
        if (findBookById(book.getId()) != null) {
            System.out.println("Book with ID " + book.getId() + " already exists.");
            return;
        }
        books.add(book);
        System.out.println("Book added: " + book);
        saveData();
    }

    public void viewAllBooks() {
        System.out.println("All Books:");
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    private Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    // ------------------- MEMBER METHODS -------------------
    public void registerMember(Member member) {
        if (findMemberById(member.getId()) != null) {
            System.out.println("Member with ID " + member.getId() + " already exists.");
            return;
        }
        members.add(member);
        System.out.println("Member registered: " + member);
        saveData();
    }

    public void viewAllMembers() {
        System.out.println("All Members:");
        if (members.isEmpty()) {
            System.out.println("No members available.");
        } else {
            for (Member member : members) {
                System.out.println(member);
            }
        }
    }

    private Member findMemberById(int id) {
        for (Member member : members) {
            if (member.getId() == id) {
                return member;
            }
        }
        return null;
    }

    // ------------------- ISSUE / RETURN -------------------
    public void issueBook(int bookId, int memberId) {
        Book book = findBookById(bookId);
        Member member = findMemberById(memberId);

        if (book != null && member != null) {
            if (book.getQuantity() > 0) {
                book.setQuantity(book.getQuantity() - 1);
                member.borrowBook(book);
                System.out.println("Issued: " + book.getTitle() + " to " + member.getName());
                saveData();
            } else {
                System.out.println("Book not available.");
            }
        } else {
            System.out.println("Book or member not found.");
        }
    }

    public void returnBook(int bookId, int memberId) {
        Book book = findBookById(bookId);
        Member member = findMemberById(memberId);

        if (book != null && member != null && member.getBorrowedBooks().contains(book)) {
            book.setQuantity(book.getQuantity() + 1);
            member.returnBook(book);  // <-- FIXED: remove from member’s list
            System.out.println("Returned: " + book.getTitle() + " by " + member.getName());
            saveData();
        } else {
            System.out.println("Invalid return attempt.");
        }
    }

    public void viewIssuedBooks() {
        System.out.println("Issued Books:");
        boolean hasIssued = false;

        for (Member member : members) {
            for (Book book : member.getBorrowedBooks()) {
                System.out.println(book.getTitle() + " -> " + member.getName());
                hasIssued = true;
            }
        }

        if (!hasIssued) {
            System.out.println("No books issued!");
        }
    }

    // ------------------- SAVE / LOAD -------------------
    public void saveData() {
        try (ObjectOutputStream bookOut = new ObjectOutputStream(new FileOutputStream(BOOKS_FILE));
             ObjectOutputStream memberOut = new ObjectOutputStream(new FileOutputStream(MEMBERS_FILE))) {
            bookOut.writeObject(books);
            memberOut.writeObject(members);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private void loadData() {
        try (ObjectInputStream bookIn = new ObjectInputStream(new FileInputStream(BOOKS_FILE));
             ObjectInputStream memberIn = new ObjectInputStream(new FileInputStream(MEMBERS_FILE))) {
            books = (List<Book>) bookIn.readObject();
            members = (List<Member>) memberIn.readObject();
            System.out.println("Data loaded successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("No previous data found. Starting fresh.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
