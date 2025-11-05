package Baitapjava8streamAPI.bai1;

import java.util.ArrayList;
import java.util.List;

public class Bai1_2_5 {
    public static void main(String[] args) {
        List<Integer> danhSachSoNguyen = new ArrayList<>();
        danhSachSoNguyen.add(1);
        danhSachSoNguyen.add(2);
        danhSachSoNguyen.add(3);
        danhSachSoNguyen.add(4);

        System.out.println("danh sach so chan la");
        List<Integer> danhSachSoChan = danhSachSoNguyen.stream().filter(e -> e % 2 == 0).toList();
        danhSachSoChan.forEach(System.out::println);

        //Bai2
        System.out.println( "danh sach binh phuong la");
        List<Integer> danhSachBinhPhuongSoLe = danhSachSoNguyen.stream().filter(e -> e % 2 != 0).map(e -> e * e).toList();
        danhSachBinhPhuongSoLe.forEach(System.out::println);

        //Bai5
        System.out.println("tong cac phan tu ");
        Integer tongCacPhanTu = danhSachSoNguyen.stream().reduce(0,(a,b) -> a+b);
        System.out.println("tong cac so la:"+tongCacPhanTu);
    }
}
