package studentmanagementsystemupdated;

import java.util.Scanner;

interface DatabaseOperations {
    void addPerson(person p);
    void viewAll();
    void searchById(int id);
    void deleteById(int id);
    void updateStudent(int id, Scanner sc);
    void updateTeacher(int id, Scanner sc);
    void assignTeacherToStudent(int sid, int tid);
}
