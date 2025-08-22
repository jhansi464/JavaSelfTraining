package studentmanagementsystemupdated;

public class Teacher extends person {
    private String subject;
    private String email;
    private String department;

    public Teacher(int id, String name, String subject, String email, String department) {
        super(id, name);
        this.subject = subject;
        this.email = email;
        this.department = department;
    }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public void displayInfo() {
        System.out.println("Teacher -> ID: " + getId() + " Name: " + getName() +
                " Subject: " + subject + " Email: " + email +
                " Department: " + department);
    }
}
