package Secondtask;

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

