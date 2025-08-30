package LibraryManagementSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Member implements Serializable {
    private int id;
    private String name;
    private String contact;
    private List<Book> borrowedBooks;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }
    public void returnBook(Book book){
        borrowedBooks.remove(book);
    }

    public Member(int id, String name, String contact) {
        this.id=id;
        this.name=name;
        this.contact=contact;
        this.borrowedBooks=new ArrayList<>();
    }
    public String toString(){
        return id+"-"+name+" contact:"+contact+" borrowed: "+borrowedBooks.size();
    }
}
