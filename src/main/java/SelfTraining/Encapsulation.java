package SelfTraining;
class Employees{
    private String name;
    private double salary;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        if(salary>0)
            this.salary=salary;
        else
            System.out.println("Salary must be positive");
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Employees emp = new Employees();
        emp.setSalary(25000);
        emp.setName("Raji");
        System.out.println("Employee Name: "+emp.getName());
        System.out.println("Employee Salary: "+emp.getSalary());
        emp.setSalary(-10000);
    }
}