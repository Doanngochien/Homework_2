package buoi2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[]args){
        System.out.println("nhập chu vi hình tròn:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double chuViHinhTron = a * 2 * 3.14 ;
        System.out.println(chuViHinhTron);
        double dienTichHinhTron = a * a * 3.14 ;
        System.out.println(dienTichHinhTron);

    }
}
