package studentmanagementsystemupdated;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class SchoolDatabase implements DatabaseOperations{
    private List<person> p1 = new ArrayList<>();
    public void addPerson(person p){
        p1.add(p);
        System.out.println("Added Successfully!!!");
    }
    public void viewAll(){
        if(p1.isEmpty()){
            System.out.println("No records found!");
            return;
        }
        for(person p : p1){
            p.displayInfo();
        }


    }
    public void searchById(int id){
        for(person p:p1){
            if(p.getId()==id){
                p.displayInfo();
                return;
            }
        }
        System.out.println("Record not found");
    }
    public void deleteById(int id){
        Iterator<person> it = p1.iterator();
        while(it.hasNext()){
            person p=it.next();
            if(p.getId()==id){
                it.remove();
                System.out.println("Removed successfully");
                return;
            }
        }
        System.out.println("Record not found");
    }
}