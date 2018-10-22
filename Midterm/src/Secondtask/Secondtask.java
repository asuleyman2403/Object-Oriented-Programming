package Secondtask;

import java.util.Date;

class Customer{
    private String name;
    private boolean memberOf = false;
    private String memberType;
    Customer(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public boolean isMember(){
        return this.memberOf;
    }
    public void setMember(boolean memberOf){
        this.memberOf = memberOf;
    }
    public String getMemberType(){
        return this.memberType;
    }
    public void setMemberType(String memberType){
        this.memberType = memberType;
    }
    public String toString(){
        return getName() + " " + getMemberType();
    }

}
class Visit{
    private Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;
    Visit(){}
    Visit(Customer customer,String date){
        this.customer = customer;
        this.date = date;
    }
    public String getName(){
        return customer.getName();
    }

    public double getServiceExpense(){
        return serviceExpense - serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType());
    }
    public void setServiceExpense(double serviceExpense){
        this.serviceExpense = serviceExpense;
    }
    public double getProductExpense(){
        return productExpense - productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType());
    }
    public void setProductExpense(double productExpense){
        this.productExpense = productExpense;
    }
    public double getTotalExpense(){
        return getProductExpense() + getServiceExpense();
    }
    public String toString(){
        return customer.toString() + " " + date;
    }
}
class DiscountRate{
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;
    public static double getServiceDiscountRate(String type){
        double res = 0;
        if(type.equals("Premium")){
            res = serviceDiscountPremium;
        }else{
            if(type.equals("Gold")){
                res = serviceDiscountGold;
            }else{
                if(type.equals("Silver")){
                     res = serviceDiscountSilver;
                }
            }
        }
        return res;
    }

    public static double getProductDiscountRate(String type){
        double res = 0;
        if(type.equals("Premium")){
            res = productDiscountPremium;
        }else{
            if(type.equals("Gold")){
                res = productDiscountGold;
            }else{
                if(type.equals("Silver")){
                    res = productDiscountSilver;
                }
            }
        }
        return res;
    }

}
public class Secondtask {
    public static void main(String[] args){
        Customer customer = new Customer("Assyl");
        customer.setMember(true);
        customer.setMemberType("Premium");
        Visit v = new Visit(customer,"24.03.2000");
        v.setProductExpense(1000);
        v.setServiceExpense(1000);
        System.out.println(v.getTotalExpense());

    }
}
