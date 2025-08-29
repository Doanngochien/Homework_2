package Buoi4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println(" nhap chieu dai:");
        int width = scaner.nextInt();
        System.out.println(" nhap chieu rong:");
        int height = scaner.nextInt();
        Rectangle rectangle = new Rectangle(width,height);
        rectangle.displayInfo();
        System.out.println("nhap chieu dai duong tron:");
        double radius = scaner.nextDouble();
        Circle circle = new Circle(radius);
        circle.displayInfo();
        double tongDienTich = rectangle.perineter()+circle.perimeter();
        double tongChuVi = rectangle.area()+ circle.area();
        System.out.println("hien ra man hinh ");


    }

}

