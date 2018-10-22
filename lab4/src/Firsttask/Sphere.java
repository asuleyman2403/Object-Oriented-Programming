package Firsttask;

class Shpere implements ThreeDShapes{
    private double radius;
    Shpere(){}
    Shpere(double radius){
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double findArea(){
        return 4*Math.PI * Math.pow(this.radius,2);
    }
    public double findVolume(){
        return 4.0/3.0 * Math.PI * Math.pow(this.radius,3);
    }

}
