package Secondtask;

public class Main {
    public static void main(String[] args){
        Circle circle1 = new Circle(5.5,"Black",true);
        Circle circle2 = new Circle(5.5,"Black",false);
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.getArea());
        Circle2 circle3 = new Circle2(5.5);
        Circle2 circle4 = new Circle2(5.5);
        System.out.println(circle3.equals(circle4));

    }
}
/*
1.overridden equals and using super VS all methods in interfaces are abstract by default
2.fields like color and filled that we could change in abstract directly or via subclasses VS all fields in interfaces
  are public final static.
3.Circle can extend only one class VS can implement many interfaces
 */