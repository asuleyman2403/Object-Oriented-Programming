class PersonSample{
    private String name;
    private String surname;
    PersonSample(){

    }
    PersonSample(String name,String surname){
        this.name = name;
        this.surname = surname;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
}
class StudentSample extends PersonSample {
    private int year;
    private String id;
    StudentSample(){
        super();
    }
    StudentSample(String name,String surname,int year,String id){
        super(name,surname);
        this.year = year;
        this.id = id;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public int getYear(){
        return this.year;
    }
    public String getName(){
        return "Student's name is " + super.getName();
    }
    public String getSurname(){
        return "Student's surname is " + super.getSurname();
    }
}
class EmployeeSample extends PersonSample {
    private int salary;
    private String id;
    EmployeeSample(){
        super();
    }
    EmployeeSample(String name,String surname,int salary,String id){
        super(name,surname);
        this.salary = salary;
        this.id = id;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public int getSalary(){
        return this.salary;
    }
    public String getName(){
        return "Employee's name is " + super.getName();
    }
    public String getSurname(){
        return "Employee's surname is " + super.getSurname();
    }
}

public class Fourth{
    public static void main(String[] args){
        StudentSample s = new StudentSample("Assyl","Suleiman",2,"17BD110353");
        EmployeeSample e = new EmployeeSample("Assyl","Suleiman",25000,"17BD110353");
        PersonSample p1 = s;
        PersonSample p2 = e;
        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }
}