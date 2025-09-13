package Buoi8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> danhSachHocSinh = new ArrayList<>();
        int chon;
        do {
            System.out.println("1. them sinh vien");
            System.out.println("2. in ra sinh vien");
            System.out.println("3. xoa sinh vien");
            System.out.println("4. update score ");
            System.out.println("5. thoat");
            chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("nhap thong tin sinh vien");
                    System.out.println("nhap id");
                    int idthem = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("nhap ten");
                    String ten = scanner.nextLine();

                    System.out.println("nhap diem");
                    int diem = scanner.nextInt();
                    Student newStudent = new Student(idthem, ten, diem);
                    danhSachHocSinh.add(newStudent);
                    break;
                case 2:
                    for (Student student : danhSachHocSinh) {
                        System.out.println("student" + student);
                    }
                    break;
                case 3:
                    System.out.println("nhap id xoa");
                    int idxoa = scanner.nextInt();
                    System.out.println("sau khi xoa");
                    for (int i = 0; i< danhSachHocSinh.size(); i++){
                        if (danhSachHocSinh.get(i).getId() == idxoa){
                            danhSachHocSinh.remove(i);
                        }
                        System.out.println(" xóa xong");
                    }
                        break;
                case 4:
                    System.out.println("nhap id");
                    int ID = scanner.nextInt();
                    for (int a = 0; a < danhSachHocSinh.size(); a++){
                        if (danhSachHocSinh.get(a).getId() == ID) {
                            System.out.println("Nhập điểm mới: ");
                            int newScore = scanner.nextInt();
                            danhSachHocSinh.get(a).setScore(newScore);
                        }
                    }
                    System.out.println("sua xong");
                        break;
                case 5:
                    System.out.println("thoat");
                    System.exit(0);
                    }
            }
            while (true) ;
        }
    }





