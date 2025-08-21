package buoi2;

import java.util.Scanner;

public class bai5 {
    public static void main(String[]argn){
        System.out.println("nhập số nguyên thứ nhất:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("nhập số nguyên thứ hai:");
        int b = scanner.nextInt();
        System.out.println("nhập số nghuên thứ ba");
        int c = scanner.nextInt();


        int[] mang = {a, b, c};
        int max = 0;
        for (int i = 0; i < mang.length ; i++){
            if(max < mang[i]) {
                max = mang[i];
            }
        }
        System.out.println("số lớn nhất là: " + max);


    }
}
