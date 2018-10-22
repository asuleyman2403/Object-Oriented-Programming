package Firsttask;

public class Main {
    public static void main(String[] args){
        Cylinder cylinder = new Cylinder(5.5,5.5);
        Shpere sphere = new Shpere(5.5);
        Cube cube = new Cube(5.5);
        Point point = new Point(5,5);
        System.out.println(cube.findArea());
        System.out.println(sphere.findArea());
        System.out.println(cylinder.findArea());
        System.out.println(point.findArea());
    }
}
