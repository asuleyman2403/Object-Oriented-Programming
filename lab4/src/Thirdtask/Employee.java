package Thirdtask;
import java.text.SimpleDateFormat;
import java.util.Date;
class Employee extends Person implements Comparable{
    double salary;
    Date hireDate;
    String insuranceNumber;
    Employee(){
        super();
    }
    Employee(String name,String surname,String id,double salary,Date hireDate,String insuranceNumber){
        super(name,surname,id);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setDate(Date hireDate){
        this.hireDate = hireDate;
    }
    public void setInsuranseNumber(String insuranceNumber){
        this.insuranceNumber = insuranceNumber;
    }
    public double getSalary(){
        return salary;
    }

    public Date getDate(){
        return this.hireDate;
    }
    public String getInsuranceNumber(){
        return insuranceNumber;
    }
    public boolean equals(Object o){
        Employee e = (Employee)o;
        return (super.equals(e) && e.getSalary() == salary && e.getDate().equals(this.hireDate) && e.getInsuranceNumber() == insuranceNumber);
    }
    public String toString(){
        return (super.toString() + " " + salary + " " + hireDate + " " + insuranceNumber);
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee cloned =  (Employee) super.clone();
        cloned.salary = this.getSalary();
        cloned.insuranceNumber = this.insuranceNumber;
        cloned.hireDate = (Date)hireDate.clone();
        return cloned;
    }

    @Override
    public int compareTo(Object o) {
        Employee e1 = (Employee)o;
        if(e1.getSalary() == this.salary){
            return 0;
        }else{
            if(e1.getSalary() > this.salary){
                return -1;
            }else{
                return 1;
            }
        }
    }
}
