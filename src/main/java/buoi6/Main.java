package buoi6;

public class Main {
    public static void main(String[] args) {
        //Create:
        Student st1 = new Student(12,"hoa",10);
        //Read:
        System.out.println(st1);
        //Update:
        st1.setScore(8.5);
        System.out.println("Điểm đã update: " + st1.getScore());
        //Reset
        st1.reset();
        System.out.println("sau khi reset " + st1);

    }
}

