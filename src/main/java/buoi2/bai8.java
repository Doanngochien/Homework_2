package buoi2;

import java.util.Scanner;

public class bai8 {
    public static void main(String[]argn){
        System.out.println("nhap so nguyen a");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++){
            int tong = i +a;
            System.out.println(i+"+"+"a"+"="+tong);
        }

    }
}
