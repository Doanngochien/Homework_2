package buoi2;

import java.util.Scanner;

public class bai8 {
    public static void main(String[]argn){
        System.out.println("nhap so nguyen n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            int tong = 0;
            tong += i;
            System.out.println(i+"+"+"n"+"="+tong);
        }

    }
}
