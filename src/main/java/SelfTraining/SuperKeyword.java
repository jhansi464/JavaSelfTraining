package SelfTraining;
class Employee{
    String name;
    double salary;
    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public void displayInfo(){
        System.out.println("Name:" +name);
        System.out.println("Salary:" +salary);
    }
}
class Manager extends Employee{
    String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department=department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department:" +department);
    }
    public void approveLeave(String employeeName){
        System.out.println("Manager:" +name+ " approved leave for " +employeeName);
    }
}
public class SuperKeyword{
    public static void main(String[] args) {
        Manager m1= new Manager("Raji",1000000,"IT");
        m1.displayInfo();
        m1.approveLeave("Hari");
    }
}