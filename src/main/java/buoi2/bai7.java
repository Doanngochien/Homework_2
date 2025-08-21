package buoi2;

import java.util.Scanner;

public class bai7 {
    public static void main(String[]argn){
        System.out.println("nhập số nguyên a");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
       for ( int i = 1; i<=10; i++){
           int tich = a * i;
           System.out.println( a + "*" +i +"="+ tich);


       }
    }
}
