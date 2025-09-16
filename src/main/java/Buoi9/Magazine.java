package Buoi9;

public class Magazine extends Document{
    private int sophathanh;
    private  int thangphathanh;

    public Magazine(int ID, String name, int sophathanh, int thangphathanh) {
        super(ID, name);
        this.sophathanh = sophathanh;
        this.thangphathanh = thangphathanh;
    }

    public int getSophathanh() {
        return sophathanh;
    }

    public void setSophathanh(int sophathanh) {
        this.sophathanh = sophathanh;
    }

    public int getThangphathanh() {
        return thangphathanh;
    }

    public void setThangphathanh(int thangphathanh) {
        this.thangphathanh = thangphathanh;
    }
}
