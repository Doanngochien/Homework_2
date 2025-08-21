package buoi2;

import java.util.Scanner;

public class bai6 {
    public static void main(String[]argn){
        System.out.println("nhập điểm trung bình của học sinh");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if( a >=8){
            System.out.println("giỏi");
        }else if( a >=6.5 ){
            System.out.println("khá");
        }else if ( a >= 5){
            System.out.println("trung bình");
        } else {
            System.out.println("yếu");
        }
    }
}
