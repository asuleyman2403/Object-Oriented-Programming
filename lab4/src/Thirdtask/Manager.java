package Thirdtask;

import java.util.ArrayList;
import java.util.Date;
class Manager extends Employee {
    ArrayList<Employee> e;
    double bonus;
    Manager(){
        super();
    }
    Manager(String name,String surname,String id,double salary,Date hireDate,String insuranceNumber,ArrayList<Employee> e){
        super(name,surname,id,salary,hireDate,insuranceNumber);
        this.e = e;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public double getBonus(){
        return this.bonus;
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

    @Override
    public int compareTo(Object o) {
        Manager m = (Manager)o;
        int res;
        if(super.compareTo(o) == 0){
            if(m.getBonus() == this.bonus){
                res = 0;
            }else{
                if(m.getBonus() > this.bonus){
                    return -1;
                }else{
                    return 1;
                }
            }
        }else{
            res = super.compareTo(o);
        }
        return res;
    }

    @Override
    public Manager clone() throws CloneNotSupportedException {
        Manager m = (Manager)super.clone();
        m.e = this.getEmployees();
        return m;
    }
}

//some questions about this lab