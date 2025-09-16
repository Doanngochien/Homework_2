package Buoi9;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Document> danhsachtailieu = new ArrayList<>();


        do {
            System.out.println("1them sach");
            System.out.println("2them tap chi");
            System.out.println("3xoa tai lieu theo id");
            System.out.println("4tim kiem tai lieu theo ten");
            System.out.println("5hien thi tat ca tai lieu");
            System.out.println("6thoat");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("nhap id");
                    int idThem = sc.nextInt();
                    sc.nextLine();
                    System.out.println("nhap ten");
                    String tenThem = sc.nextLine();
                    System.out.println("nhap tac gia");
                    String tacGiaThem = sc.nextLine();
                    System.out.println("nhap nam xuat ban");
                    int namxuatban = sc.nextInt();
                    Book newbook = new Book(idThem, tenThem, tacGiaThem, namxuatban);
                    danhsachtailieu.add(newbook);
                    break;
                case 2:
                    System.out.println("nhap id");
                    int idThem2 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("nhap ten");
                    String tenThem2 = sc.nextLine();
                    System.out.println("nhap so phat hanh");
                    int sophThem = sc.nextInt();
                    System.out.println("nhap thang phat hanh");
                    int thangphThem = sc.nextInt();
                    Magazine newmagazine = new Magazine(idThem2, tenThem2, sophThem, thangphThem);
                    danhsachtailieu.add(newmagazine);
                    break;
                case 3:
                    System.out.println("nhap id xoa");
                    int idxoa = sc.nextInt();
                    System.out.println("sau khi xoa");
                    for (Document document : danhsachtailieu) {
                        if (document.getID() == idxoa) {
                            danhsachtailieu.remove(document);
                            System.out.println(" xong");
                        }
                    }
                    break;
                case 4:
                    System.out.println("nhap ten tai lieu");
                    String taiLieu = sc.nextLine();
                    for ( Document document : danhsachtailieu){
                        if ( document.getName().trim().equals(taiLieu.trim())){
                            System.out.println(document);
                        }
                        break;
                    }
                case 5:
                    for (Document d : danhsachtailieu)
                        System.out.println("Thông tin tài liệu: " + d);
                    break;
                case 6:
                    System.out.println("ket thuc");
                    System.exit(0);




            }
        }while(true);
    }
}