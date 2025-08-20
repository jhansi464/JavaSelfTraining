package SelfTraining;

class Student1 {
    String name;

    Student1(String name) {
        this.name = name; // refers to instance variable
    }

    void display() {
        System.out.println("Student Name: " + this.name);
    }
}

public class thisKeyword {
    public static void main(String[] args) {
        Student1 s = new Student1("Jhansi");
        s.display();
    }
}
