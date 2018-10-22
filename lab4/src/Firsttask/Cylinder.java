package Firsttask;

class Cylinder implements ThreeDShapes{
    private double radius;
    private double height;
    Cylinder(){}
    Cylinder(double radius,double height){
        this.radius = radius;
        this.height = height;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public double findArea(){
        return 2*Math.PI * Math.pow(this.radius,2) + 2* Math.PI * radius * height;
    }
    public double findVolume(){
        return Math.PI * radius * radius * height;
    }

}
