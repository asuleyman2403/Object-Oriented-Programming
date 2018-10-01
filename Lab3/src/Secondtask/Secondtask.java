import java.lang.Math;
abstract class  Shapes{
    abstract double findSurfaceArea();
    abstract double findVolume();
    abstract String get2DFigure();
}
class Cylinder extends Shapes{
    private double radius;
    private double length;
    Cylinder(double radius,double length){
        this.radius = radius;
        this.length = length;
    }
    double findSurfaceArea(){
        double area = 2*Math.PI * Math.pow(radius,2) + 2 * Math.PI * radius + length;
        return area;
    }
    double findVolume(){
        double volume = Math.PI * Math.pow(radius,2) * length;
        return volume;
    }
    String get2DFigure(){
        return "From front 2D Shape is a Rectangle \nFrom above 2D Shape is a Circle";
    }

}
class Sphere extends Shapes{
    private double radius;
    Sphere(double radius){
        this.radius = radius;
    }
    double findSurfaceArea(){
        double area = 4 * Math.PI * Math.pow(radius,2);
        return area;
    }
    double findVolume(){
        double volume = 4.0/3.0 * Math.PI * Math.pow(radius,3);
        return volume;
    }
    String get2DFigure(){
        return "2D Figure of Sphere is a Circle";
    }
}
class Cube extends Shapes{
    private double length;
    Cube(double length){
        this.length = length;
    }
    double findSurfaceArea(){
        double area = 6*Math.pow(length,2);
        return area;
    }
    double findVolume(){
        double volume = Math.pow(length,3);
        return volume;
    }
    String get2DFigure(){
        return "2D Figure of Cube is a Square";
    }
}
public class Secondtask{
    public static void main(String[] args){
        Cylinder cylinder = new Cylinder(15,10);
        Sphere sphere = new Sphere(15);
        Cube cube = new Cube(15);
        System.out.println(cylinder.findSurfaceArea());
        System.out.println(cylinder.findVolume());
        System.out.println( cylinder.get2DFigure());
        System.out.println(sphere.findSurfaceArea());
        System.out.println( sphere.findVolume());
        System.out.println( sphere.get2DFigure());
        System.out.println( cube.findSurfaceArea());
        System.out.println( cube.findVolume());
        System.out.println( cube.get2DFigure());
    }
}