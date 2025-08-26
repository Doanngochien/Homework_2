package Buoi3;

public class Book {
    String title ;
    String outhor;
    int price;

    public Book(String title, String outhor, int price) {
        this.title = title;
        this.outhor = outhor;
        this.price = price;
    }
    public void thongTinSach(){
        System.out.println("tên sách" + this.title);
        System.out.println("tác giả "+ this.outhor);
        System.out.println("giá " + this.price);

    }
}
