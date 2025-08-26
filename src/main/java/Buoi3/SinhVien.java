package Buoi3;

public class SinhVien {
    String ten;
    int namSinh;
    int diem;

    public SinhVien(String ten, int namSinh, int diem) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.diem = diem;
    }

    public void xetLoai (int diem) {
       if (diem > 5) {
           System.out.println(" tb ");
       } else if (diem > 7) {
           System.out.println(" khá ");
       } else if (diem > 8) {
           System.out.println(" giỏi");
       }
   }

    public int tinhTuoi (int namHienTai){
        int tuoi = namHienTai - this.namSinh;
        return tuoi;
   }
}
