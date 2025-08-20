package studentmanagementsystemupdated;

interface DatabaseOperations{
    void addPerson(person p);
    void viewAll();
    void searchById(int id);
    void deleteById(int id);
}
