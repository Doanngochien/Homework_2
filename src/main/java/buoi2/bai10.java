package buoi2;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args){
        System.out.println("nhập năm:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if ( a % 400==0) // (a%4==0 && a%100 !=0 ){
            System.out.println("năm nhuận");
        else{
            System.out.println("không phải năm nhuận");
        }
    }
}
