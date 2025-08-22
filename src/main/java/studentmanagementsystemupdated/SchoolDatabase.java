package studentmanagementsystemupdated;

import java.util.*;

public class SchoolDatabase implements DatabaseOperations {
    private List<person> p1 = new ArrayList<>();

    @Override
    public void addPerson(person p) {
        // Check unique ID
        for (person existing : p1) {
            if (existing.getId() == p.getId()) {
                System.out.println("ID already exists! Try another ID.");
                return;
            }
        }
        p1.add(p);
        System.out.println("Added Successfully!!!");
    }

    @Override
    public void viewAll() {
        if (p1.isEmpty()) {
            System.out.println("No records found!");
            return;
        }
        for (person p : p1) {
            p.displayInfo();
            System.out.println();
        }
    }

    @Override
    public void searchById(int id) {
        for (person p : p1) {
            if (p.getId() == id) {
                p.displayInfo();
                return;
            }
        }
        System.out.println("Record not found!");
    }

    @Override
    public void deleteById(int id) {
        Iterator<person> it = p1.iterator();
        while (it.hasNext()) {
            person p = it.next();
            if (p.getId() == id) {
                it.remove();
                System.out.println("Removed successfully");
                return;
            }
        }
        System.out.println("Record not found!");
    }

    @Override
    public void updateStudent(int id, Scanner sc) {
        for (person p : p1) {
            if (p.getId() == id && p instanceof Student) {
                Student s = (Student) p;
                System.out.print("Enter new name: "); s.setName(sc.nextLine());
                System.out.print("Enter new course: "); s.setCourse(sc.nextLine());
                System.out.print("Enter new grade: "); s.setGrade(sc.nextLine());
                System.out.print("Enter new interested domain: "); s.setInterestedDomain(sc.nextLine());
                System.out.print("Enter new favorite subject: "); s.setFavSubject(sc.nextLine());
                System.out.println("Student details updated successfully");
                return;
            }
        }
        System.out.println("Student not found with ID: " + id);
    }

    @Override
    public void updateTeacher(int id, Scanner sc) {
        for (person p : p1) {
            if (p.getId() == id && p instanceof Teacher) {
                Teacher t = (Teacher) p;
                System.out.print("Enter new name: "); t.setName(sc.nextLine());
                System.out.print("Enter new subject: "); t.setSubject(sc.nextLine());
                System.out.print("Enter new email: "); t.setEmail(sc.nextLine());
                System.out.print("Enter new department: "); t.setDepartment(sc.nextLine());
                System.out.println("Teacher details updated successfully");
                return;
            }
        }
        System.out.println("Teacher not found with ID: " + id);
    }

    @Override
    public void assignTeacherToStudent(int sid, int tid) {
        Student student = null;
        Teacher teacher = null;

        for (person p : p1) {
            if (p.getId() == sid && p instanceof Student) student = (Student) p;
            if (p.getId() == tid && p instanceof Teacher) teacher = (Teacher) p;
        }

        if (student != null && teacher != null) {
            student.assignTeacher(teacher);
            System.out.println("Teacher " + teacher.getName() + " assigned to Student " + student.getName());
        } else {
            System.out.println("Teacher or Student not found with given IDs");
        }
    }
}
