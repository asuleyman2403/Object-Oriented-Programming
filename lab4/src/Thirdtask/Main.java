package Thirdtask;
import java.util.ArrayList;
import java.util.Date;

public class Main{
    public static void main(String[] args){
        ArrayList<Employee> e = new ArrayList<Employee>();
        Employee emp = new Employee("Assyl","Suleiman","17BD110353",
                21000, new Date(2000,3,24),"None");
        e.add(emp);
        Manager m1 = new Manager("Nursyltan","Nazarbayev","ThePresident",
                100000000, new Date(2000,3,24),"Insured",e);
        Manager m2 = new Manager("Nursyltan","Nazarbayev","ThePresident",
                100000000, new Date(2000,3,24),"Insured",e);
        m1.setBonus(24032000);
        m2.setBonus(24032000);
        try{
            Manager m3 = m1.clone();
            Manager m4 = m2.clone();
            System.out.println("m3 and m4:  " + m3.compareTo(m4));

        }catch(CloneNotSupportedException ex){
            System.out.println("Error");
        }
        System.out.println(m1.compareTo(m2));

    }
}
