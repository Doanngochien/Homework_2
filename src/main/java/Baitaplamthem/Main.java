package Baitaplamthem;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee nv1 = new FullTimeEmployee("hoa", 20,123, 5000000);
        nv1.displayInfo();
        nv1.calculateSalary();
        PartTimeEmployee nv2 = new PartTimeEmployee("đào",18,345, 20,8);
        nv2.displayInfo();
        nv2.calculateSalary();
    }
}
