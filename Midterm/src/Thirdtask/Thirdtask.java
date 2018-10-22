package Thirdtask;

abstract class Shape{
    protected String color;
    protected boolean filled;
    Shape(){

    }
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();
    public String toString(){
        return "This is Shape";
    }
    public boolean equals(Object o){
        Shape s = (Shape)o;
        if(s.getColor() == this.color && s.isFilled() == this.filled){
            return true;
        }else{
            return false;
        }
    }
}
class Circle extends Shape{

    protected double radius;
    Circle(){}
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius,String color,boolean filled){
        super(color,filled);
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
    public boolean equals(Object o){
        Circle c = (Circle)o;
        if(c.getRadius() == this.radius && super.equals(o)){
            return true;
        }else{
            return false;
        }
    }
}
class Rectangle extends Shape{
    protected double width;
    protected double length;
    Rectangle(){

    }
    Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }
    Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return this.length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea() {
        return this.width * this.length;
    }
    public double getPerimeter(){
        return 2*(this.width+this.length);
    }
    public String toString(){
        return "This is Rectangle";
    }
    public boolean equals(Object o){
        Rectangle r = (Rectangle)o;
        if(r.width == this.width && r.length == this.length && super.equals(o)){
            return true;
        }else{
            return false;
        }
    }
}
class Square extends Rectangle{
    Square(){
    }
    Square(double side){
        super(side,side);
    }
    Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return super.length;
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public String toString(){
        return "This is Square";
    }

    public boolean equals(Object o){
        return super.equals(o);
    }
}
public class Thirdtask{
    public static void main(String [] args){
        Rectangle r = new Square(5.0,"black",true);
        //Square sq = new Rectangle(5.0,5.0);
        Rectangle rt = new Rectangle(5.0,5.0,"black",true);
        //Square sq = (Square)rt;
        Square sq = new Square(5.0,"black",true);
        if(r.equals(sq)){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not equal");
        }
    }
}