package Secondtask;

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
