
package pkg251_project_group_one;

import java.util.ArrayList;


public class Student extends User {

    //attributes
    private String department;
    private EventRegistration EnrollEvent;
    public static ArrayList<Student> students = new ArrayList<>();

   //constructor
    public Student(String department, EventRegistration EnrollEvent, String userName, String password, String firstName, String middleName, String lastName, String eamil) {
        super(userName, password, firstName, middleName, lastName, eamil);
        this.department = department;
        this.EnrollEvent = EnrollEvent;
    }

    //setters
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEnrollEvent(EventRegistration EnrollEvent) {
        this.EnrollEvent = EnrollEvent;
    }

   
    public static void setStudents(ArrayList<Student> students) {   
        Student.students = students;
    }

    //getters
    public String getDepartment() {
        return department;
    }

    public EventRegistration getEnrollEvent() {
        return EnrollEvent;
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }
  

}