package studentmanagementsystemupdated;
public class Student extends person {
    private String course;
    private String grade;
    private String interestedDomain;
    private String favSubject;
    private Teacher assignedTeacher;

    public Student(int id, String name, String course, String grade,
                   String interestedDomain, String favSubject) {
        super(id, name);
        this.course = course;
        this.grade = grade;
        this.interestedDomain = interestedDomain;
        this.favSubject = favSubject;
    }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    public String getInterestedDomain() { return interestedDomain; }
    public void setInterestedDomain(String interestedDomain) { this.interestedDomain = interestedDomain; }

    public String getFavSubject() { return favSubject; }
    public void setFavSubject(String favSubject) { this.favSubject = favSubject; }

    public void assignTeacher(Teacher teacher) { this.assignedTeacher = teacher; }
    public Teacher getAssignedTeacher() { return assignedTeacher; }

    @Override
    public void displayInfo() {
        System.out.println("Student -> ID: " + getId() + " Name: " + getName() +
                " Course: " + course + " Grade: " + grade +
                " Interested Domain: " + interestedDomain +
                " Favorite Subject: " + favSubject);
        if (assignedTeacher != null) {
            System.out.println("Assigned Teacher: " + assignedTeacher.getName());
        } else {
            System.out.println("Assigned Teacher: None");
        }
    }
}
