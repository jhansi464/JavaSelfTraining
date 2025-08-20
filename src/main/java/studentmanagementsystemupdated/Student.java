package studentmanagementsystemupdated;

class Student extends person {
    private String course;
    private String grade;
    private String intrestedDomain;

    public void setFav(String fav) {
        this.fav = fav;
    }

    private String fav;

    public String getFav() {
        return fav;
    }

    public void setIntrestedDomain(String intrestedDomain) {
        this.intrestedDomain = intrestedDomain;
    }

    public String getIntrestedDomain() {
        return intrestedDomain;
    }

    public Student(int id, String name, String course, String grade, String fav, String intrestedDomain) {
        super(id, name);
        this.course = course;
        this.grade = grade;
        this.fav = fav;
        this.intrestedDomain = intrestedDomain;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void displayInfo() {
        System.out.println("Student -> ID: " + getId() + " Name: " + getName() + " Course: " + course + " Grade: " + grade +" Intrested Domain: " +intrestedDomain +" Favourite Subject: "+fav);
    }

}