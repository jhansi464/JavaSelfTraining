package SelfTraining;
class Student{
    String name;
    int age;
    Student(){
        name="Unknow";
        age=0;
        System.out.println("Default Constructor called");
    }
    Student(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("Parameterized constructor called");
    }
    void display(){
        System.out.println("Name: "+name+ ", age: "+age);
    }
}
public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student("Raji",10);
        s2.display();
    }
}