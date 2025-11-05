package Baitapjava8streamAPI.Bai7;

import Baitapjava8streamAPI.bai6.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bai7_8 {
    public static void main(String[] args) {
        List<Person> danhSachPerson = new ArrayList<>();
        danhSachPerson.add(new Person("Phuong",17));
        danhSachPerson.add(new Person("Hong",14));
        danhSachPerson.add(new Person("Ngoc",22));
        danhSachPerson.add(new Person("My",13));
       boolean coNguoiDuoi18 = danhSachPerson.stream().anyMatch(e -> e.getAge()<18);
        boolean tatCaTren15 = danhSachPerson.stream().allMatch(e ->e.getAge()>15);
        System.out.println("co ai duoi 18 khong:"+coNguoiDuoi18);
        System.out.println("tat ca tren 15 khong:"+tatCaTren15);

        //Bai8
        String chuoiTen = danhSachPerson.stream().map(e -> e.getName())
                .collect(Collectors.joining(","));
        System.out.println("chuoi ten:"+chuoiTen);





    }
}
