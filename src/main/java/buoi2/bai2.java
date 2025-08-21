package buoi2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("nhập chiều dài:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("nhập chiều rộng:");
        int b = scanner.nextInt();
        int dienTichHinhChuNhat = a * b;
        System.out.println(dienTichHinhChuNhat);


    }
}