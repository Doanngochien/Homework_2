package Buoi4;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double perimeter (){
        double perimeter=(2*Math.PI*this.radius);
        return perimeter;
    }
    public double area (){
        double area = (Math.PI*this.radius*this.radius);
        return area;

    }

    public void displayInfo() {
        System.out.println("chu vi:"+perimeter());
        System.out.println("dien tich:"+area());
    }
}
