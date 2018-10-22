package Firsttask;

public class Cube implements ThreeDShapes{
    private double length;
    Cube(){}
    Cube(double length){
        this.length = length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){
        return this.length;
    }
    public double findArea(){
        return 6*length*length;
    }
    public double findVolume(){
        return Math.pow(length,3);
    }
}
