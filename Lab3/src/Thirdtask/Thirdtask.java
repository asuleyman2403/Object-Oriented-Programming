import java.util.ArrayList;
class Person{
    private String name;
    private String surname;
    private String id;
    Person(){}
    Person(String name,String surname,String id){
        this.name = name;
        this.surname = surname;
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String getId(){
        return id;
    }
    public boolean equals(Object o){
        Person p = (Person)o;
        return (p.getSurname().equals(surname) && p.getName().equals(name) && p.getId().equals(id));
    }
    public String toString(){
        return name + " " + surname + " " + id;
    }
}
class Employee extends Person{
    private double salary;
    private int year;
    private String insuranceNumber;
    Employee(){
        super();
    }
    Employee(String name,String surname,String id,double salary,int year,String insuranceNumber){
        super(name,surname,id);
        this.salary = salary;
        this.year = year;
        this.insuranceNumber = insuranceNumber;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setInsuranseNumber(String insuranceNumber){
        this.insuranceNumber = insuranceNumber;
    }
    public double getSalary(){
        return salary;
    }
    public int getYear(){
        return year;
    }
    public String getInsuranceNumber(){
        return insuranceNumber;
    }
    public boolean equals(Object o){
        Employee e = (Employee)o;
        return (super.equals(e) && e.getSalary() == salary && e.getYear() == year && e.getInsuranceNumber() == insuranceNumber);
    }
    public String toString(){
        return (super.toString() + " " + salary + " " + year + " " + insuranceNumber);
    }
}
class Manager extends Employee{
    private ArrayList<Employee> e;
    Manager(){
        super();
    }
    Manager(String name,String surname,String id,double salary,int year,String insuranceNumber,ArrayList<Employee> e){
        super(name,surname,id,salary,year,insuranceNumber);
        this.e = e;
    }
    public void setEmployees(ArrayList<Employee> e){
        this.e = e;
    }
    public ArrayList<Employee> getEmployees(){
        return this.e;
    }
    public void addEmployee(Employee emp){
        e.add(emp);
    }
    public boolean equals(Object o){
        Manager m = (Manager)o;
        return (super.equals(m) && m.getEmployees().equals(e));
    }
    public String toString(){
        String res = super.toString();
        res+="\n";
        for(Employee emp:e ){
            res += e.toString() + "\n";
        }
        return res;
    }
}

public class Thirdtask{
    public static void main(String[] args){
        ArrayList<Employee> e = new ArrayList<Employee>();
        Employee emp = new Employee("Assyl","Suleiman","17BD110353",
                                    21000,2000,"None");
        e.add(emp);
        Manager m1 = new Manager("Nursyltan","Nazarbayev","ThePresident",
                                 100000000,1960,"Insured",e);
        Manager m2 = new Manager("Nursyltan","Nazarbayev","ThePresident",
                                 100000000,1960,"Insured",e);
        System.out.println(m1.toString());
        if(m1.equals(m2)){
            System.out.println("They are same person");
        }else{
            System.out.println("They are different persons");
        }
    }
}