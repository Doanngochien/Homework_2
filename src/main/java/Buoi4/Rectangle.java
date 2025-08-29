package Buoi4;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int perineter() {
        int chuVi = 2 * (this.width + this.height);
        return chuVi;
    }
    public int area(){
        int dienTich = this.width*this.height;
        return dienTich;

    }
    public void displayInfo(){
     System.out.println("dien tich:"+ perineter());
     System.out.println(" chu vi: "+ area());
    }
}
