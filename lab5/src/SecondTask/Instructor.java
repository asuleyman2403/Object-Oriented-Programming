package SecondTask;

import java.io.Serializable;

public class Instructor implements Serializable {
    private String firstName;
    private String lastName;
    private String department;
    private String email;

    Instructor(){}
    Instructor(String firstName,String lastName,String department,String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.email = email;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getDepartment(){
        return this.department;
    }
    public String getEmail(){
        return this.email;
    }
    public String toString(){
        return this.lastName + " " + this.firstName + " " + this.department + " " + this.email;
    }
    public boolean equals(Object o){
        Instructor instructor = (Instructor)o;
        boolean ok = false;
        if(instructor.getLastName().equals(this.lastName) && instructor.getFirstName().equals(this.firstName) && instructor.getDepartment().equals(this.department) && instructor.getEmail().equals(this.email)){
            ok = true;
        }
        return ok;
    }
}
