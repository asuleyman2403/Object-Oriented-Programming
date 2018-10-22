package Secondtask;

public class Circle2 implements Shape2 {
    protected double radius;
    protected boolean isFilled = Shape2.isFilled;
    protected String color  = Shape2.color;
    Circle2(){}
    Circle2(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2*Math.PI * radius;
    }
    public String toString(){
        return "This is Rectangle";
    }
    public String getColor(){
        return this.color;
    }
    public boolean isFilled(){
        return this.isFilled;
    }
    public boolean equals(Object o){
        Circle2 c = (Circle2)o;
        if(c.getRadius() == this.radius && c.isFilled() == this.isFilled && c.getColor() == this.color ){
            return true;
        }else{
            return false;
        }
    }
}
