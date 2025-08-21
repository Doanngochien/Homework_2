package buoi2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[]args){
        System.out.println("nhập số nguyên:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 ==0){
        System.out.println("chẵn");}
        else{
                System.out.println("lẻ");
            }


    }
}
