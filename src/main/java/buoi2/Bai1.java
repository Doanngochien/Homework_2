package buoi2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args){
        System.out.println(" nhập số nguyên thứ nhất:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(" nhap so nguyen thu hai: ");
        int b = scanner.nextInt();
        int tongHaiSoNguyen = a +b ;
        System.out.println(tongHaiSoNguyen );
    }
}
