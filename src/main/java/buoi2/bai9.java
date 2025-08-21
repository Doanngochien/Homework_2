package buoi2;

import java.util.Scanner;

public class bai9 {
    public static void main(String[]argn){
        System.out.println("nhập số nguyên dương n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int giaiThua = 1;
        for ( int i = 1; i <= n; i++) {
            giaiThua *= i;
        }


        System.out.println(giaiThua);

    }
}
