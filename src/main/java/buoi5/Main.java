package buoi5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hocsinh hocSinh1 = new Hocsinh(0, null, 0, 0, 0, 0);
        Scanner scanner = new Scanner(System.in);
        hocSinh1.nhapThongTin();
        hocSinh1.diemTrungBinh();
        hocSinh1.xepLoai();
    }
    }