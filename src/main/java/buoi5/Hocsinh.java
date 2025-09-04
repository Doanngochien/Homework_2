package buoi5;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Hocsinh {
    int maHS;
    String tenHS;
    int tuoi;
    int diemToan;
    int diemLy;
    int diemHoa;

    public Hocsinh(int maHS, String tenHS, int tuoi, int diemToan, int diemLy, int diemHoa) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.tuoi = tuoi;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    public void nhapThongTin(){
    Scanner scanner = new Scanner(System.in);
        int Scanner = scanner.nextInt();
        System.out.println("nhập thông tin học sinh");
        System.out.println("nhập mã học sinh");
        this.maHS = scanner.nextInt();
        System.out.println("nhập tên học sinh");
        this.tenHS = scanner.nextLine();
        System.out.println("nhập tuổi học sinh");
        this.tuoi = scanner.nextInt();
        System.out.println("nhập điểm toán");
        this.diemToan = scanner.nextInt();
        System.out.println("nhập điểm lý");
        this.diemLy = scanner.nextInt();
        System.out.println("nhập điểm hóa");
        this.diemHoa = scanner.nextInt();
    }
    public void hienThiTHongTin(){
        System.out.println("mã học sinh"+ this.maHS);
        System.out.println("tên học sinh"+this.tenHS);
        System.out.println("tuổi học sinh"+ this.tuoi);
        System.out.println("điểm toán"+this.diemToan);
        System.out.println("điêm lý"+ this.diemLy);
        System.out.println("điểm hóa"+this.diemHoa);
    }
    public float diemTrungBinh(){
        float diemTrungBinh = (float) (this.diemToan+this.diemLy+this.diemHoa)/3;
        System.out.println("điểm trung bình: "+diemTrungBinh);
        return diemTrungBinh;
    }
    public String xepLoai(){
        String xepLoai = new String();
        if(diemTrungBinh()>=8){
            xepLoai = "giỏi";
        }else if(8>=diemTrungBinh()&&diemTrungBinh()>=6.5){
            xepLoai = "khá";
        }else if (6.5>= diemTrungBinh()&&diemTrungBinh()>=5){
            xepLoai = "trung bình";
        }else{ xepLoai = "yếu";
        }
        return xepLoai;

    }


}
