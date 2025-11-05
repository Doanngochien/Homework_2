package Baitapjava8streamAPI.Bai3;

import java.util.ArrayList;
import java.util.List;

public class Bai3_4 {
    public static void main(String[] args) {
        List<String> danhSachTen = new ArrayList<>();
        danhSachTen.add("Phuong");
        danhSachTen.add("Hong");
        danhSachTen.add("Ngoc");
        danhSachTen.add("My");
        danhSachTen.add("");

        Long chuoiLonHon3KyTu = danhSachTen.stream().filter(e ->e.length()>3).count();
        System.out.println(" so ten dai hon 3 ky tu la: "+chuoiLonHon3KyTu);
        List<String> danhSachLocNull= danhSachTen.stream().filter(e -> !e.equals("")).sorted().toList();
        System.out.println("danh sach xap xep:");
        danhSachLocNull.forEach(System.out::println);





    }
}
