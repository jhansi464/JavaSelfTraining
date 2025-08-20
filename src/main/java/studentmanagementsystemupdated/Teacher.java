package studentmanagementsystemupdated;

class Teacher extends person {
    private String subject;

    public void setMail(String mail) {
        this.mail = mail;
    }

    private String mail;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private String department;

    public String getMail() {
        return mail;
    }

    public Teacher(int id, String name, String subject, String mail, String department) {
        super(id, name);
        this.subject = subject;
        this.mail = mail;
        this.department = department;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void displayInfo() {
        System.out.println("Teacher ID: " + getId() + " Name: " + getName() + " Subject: " + subject +" mail: "+mail +" Department: " +department);
    }
}