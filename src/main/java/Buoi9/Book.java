package Buoi9;

public class Book extends Document {
    private String tacgia;
    private int namxuatban;

    public Book(int ID, String name, String tacgia, int namxuatban) {
        super(ID, name);
        this.tacgia = tacgia;
        this.namxuatban = namxuatban;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public int getNamxuatban() {
        return namxuatban;
    }

    public void setNamxuatban(int namxuatban) {
        this.namxuatban = namxuatban;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tacgia='" + tacgia + '\'' +
                ", namxuatban=" + namxuatban +
                '}';
    }
}