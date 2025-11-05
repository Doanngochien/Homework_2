package Baitapjava8streamAPI.bai6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> danhSachPerson = new ArrayList<>();
        danhSachPerson.add(new Person("hoa",22));
        danhSachPerson.add(new Person("ha",9));
        danhSachPerson.add(new Person("huy",24));
        danhSachPerson.add(new Person("hien",25));
        List<Person> danhSachHon20Tuoi = danhSachPerson.stream().filter(e -> e.getAge()>=20).toList();
        List<String> danhSachTenNguoiHon20Tuoi = danhSachHon20Tuoi.stream().map(e ->e.getName()).toList();
        List<Person> xapXepDanhSach = danhSachHon20Tuoi.stream()
                .sorted(Comparator.comparingInt(Person::getAge).reversed()).toList();
        System.out.println("danh sach nguoi lon hown 20 tuoi:");
        danhSachHon20Tuoi.forEach(System.out::println);
        System.out.println("ten nguoi lon hon 20 tuoi:");
        danhSachTenNguoiHon20Tuoi.forEach(System.out::println);
        System.out.println("xap xep theo tuoi giam dan:");
        xapXepDanhSach.forEach(System.out::println);

    }


}
